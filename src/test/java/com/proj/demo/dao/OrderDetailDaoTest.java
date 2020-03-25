package com.proj.demo.dao;

import com.proj.demo.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    OrderDetailDao orderDetailDao;
    @org.junit.Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("51544");
        orderDetail.setOrderId("55555");
        orderDetail.setProductIcon("http://sadas.jpg");
        orderDetail.setProductId("00005");
        orderDetail.setProductName("cookie");
        orderDetail.setProductPrice(new BigDecimal(8.88));
        orderDetail.setProductQuantity(100);
        OrderDetail result = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = orderDetailDao.findByOrderId("55555");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}