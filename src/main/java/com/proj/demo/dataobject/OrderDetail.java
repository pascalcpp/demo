package com.proj.demo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @program: demo
 * @description: orderdetail
 * @author: "xpcf"
 * @create: 2020-03-24 13:15
 **/
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private String productIcon;
    private Integer productQuantity;
    public OrderDetail(){

    }
}
