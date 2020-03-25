package com.proj.demo.dao;

import com.proj.demo.dataobject.OrderMaster;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {
    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void findByBuyerOpenid() {
        Page<OrderMaster> page = orderMasterDao
                .findByBuyerOpenid("10000", PageRequest.of(1,3));
        System.out.println(page.getTotalElements());
    }
    @Test
    public void save(){
        OrderMaster orderMaster  = new OrderMaster();
        orderMaster.setOrderId("00552");
        orderMaster.setBuyerName("zoe");
        orderMaster.setBuyerPhone("19987774114");
        orderMaster.setBuyerOpenid("10000");
        orderMaster.setBuyerAddress("athome");
        orderMaster.setOrderAmount(new BigDecimal(10.14));
        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(result);
    }
}