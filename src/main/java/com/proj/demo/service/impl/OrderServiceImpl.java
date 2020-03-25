package com.proj.demo.service.impl;

import com.proj.demo.dataobject.OrderDetail;
import com.proj.demo.dataobject.ProductInfo;
import com.proj.demo.dto.OrderDTO;
import com.proj.demo.service.OrderService;
import com.proj.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @program: demo
 * @description: no
 * @author: "xpcf"
 * @create: 2020-03-24 18:29
 **/
public class OrderServiceImpl implements OrderService {
    @Autowired
    ProductService productService;
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
            for (OrderDetail orderDetail : orderDTO.getOrderDetailList()){
               ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
               
            }
    }

    @Override
    public OrderDTO findOne(String OrderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
