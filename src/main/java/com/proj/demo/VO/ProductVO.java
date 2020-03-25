package com.proj.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @program: demo
 * @description: VO商品包含类目
 * @author: "xpcf"
 * @create: 2020-03-24 08:12
 **/
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVOList;

}

