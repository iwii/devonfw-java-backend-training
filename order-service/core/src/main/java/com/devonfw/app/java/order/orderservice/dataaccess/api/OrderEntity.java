package com.devonfw.app.java.order.orderservice.dataaccess.api;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;

import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;

/**
 * @author IMATUJEW
 */
@Entity(name = "Order")
public class OrderEntity {
  private LocalDate creationDate;

  private Set<ItemEntity> orderPositions;

  private CustomerEntity owner;

  private double price;

  private OrderStatus status;

}
