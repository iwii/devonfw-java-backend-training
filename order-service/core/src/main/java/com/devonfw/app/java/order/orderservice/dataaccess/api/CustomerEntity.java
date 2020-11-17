package com.devonfw.app.java.order.orderservice.dataaccess.api;

import java.util.Set;

import javax.persistence.Entity;

/**
 * @author IMATUJEW
 */
@Entity(name = "Customer")
public class CustomerEntity {

  private String firstName;

  private String lastName;

  private Set<OrderEntity> orders;

}
