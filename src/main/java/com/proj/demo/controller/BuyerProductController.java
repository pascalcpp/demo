package com.proj.demo.controller;

import com.proj.demo.VO.ProductInfoVo;
import com.proj.demo.VO.ProductVO;
import com.proj.demo.VO.ResultVO;
import com.proj.demo.dataobject.ProductCategory;
import com.proj.demo.dataobject.ProductInfo;
import com.proj.demo.service.CategoryService;
import com.proj.demo.service.ProductService;
import com.proj.demo.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){
        System.out.println("aaa");
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = new ArrayList<Integer>();
        categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService
                .findByCategoryTypeIn(categoryTypeList);
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList){
                if(productCategory.getCategoryType().equals(productInfo.getCategoryType())){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo,productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }

            }
            productVO.setProductInfoVOList(productInfoVoList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
