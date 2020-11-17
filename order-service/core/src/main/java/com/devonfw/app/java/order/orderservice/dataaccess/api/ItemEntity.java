package com.devonfw.app.java.order.orderservice.dataaccess.api;

import javax.persistence.Entity;

/**
 * @author IMATUJEW
 */
@Entity(name = "Item")
public class ItemEntity {

  private String name;

  private String description;

  private double price;

}
