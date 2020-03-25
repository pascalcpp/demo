package com.proj.demo.dao;

import com.proj.demo.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: demo
 * @description: orderdetail
 * @author: "xpcf"
 * @create: 2020-03-24 13:25
 **/
public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String OrderId);

}
