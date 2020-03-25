package com.proj.demo.dto;

import com.proj.demo.dataobject.OrderDetail;
import com.proj.demo.dataobject.OrderMaster;
import com.proj.demo.enums.OrderStatusEnum;
import com.proj.demo.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @program: demo
 * @description: no
 * @author: "xpcf"
 * @create: 2020-03-24 18:20
 **/
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    /*订单总金额*/
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;
    private List<OrderDetail> orderDetailList;
}
