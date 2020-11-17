package com.devonfw.app.java.order.orderservice.dataaccess.api;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Transient;

import com.devonfw.app.java.order.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.app.java.order.orderservice.common.api.Order;
import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;

/**
 * @author IMATUJEW
 */
@Entity(name = "Order")
public class OrderEntity extends ApplicationPersistenceEntity implements Order {

  private LocalDate creationDate;

  private Set<ItemEntity> orderPositions;

  private CustomerEntity owner;

  private double price;

  private OrderStatus status;

  private static final long serialVersionUID = 1L;

  /**
   * @return creationDate
   */
  public LocalDate getCreationDate() {

    return this.creationDate;
  }

  /**
   * @param creationDate new value of {@link #getcreationDate}.
   */
  public void setCreationDate(LocalDate creationDate) {

    this.creationDate = creationDate;
  }

  /**
   * @return orderPositions
   */
  public Set<ItemEntity> getOrderPositions() {

    return this.orderPositions;
  }

  /**
   * @param orderPositions new value of {@link #getorderPositions}.
   */
  public void setOrderPositions(Set<ItemEntity> orderPositions) {

    this.orderPositions = orderPositions;
  }

  /**
   * @return owner
   */
  public CustomerEntity getOwner() {

    return this.owner;
  }

  /**
   * @param owner new value of {@link #getowner}.
   */
  public void setOwner(CustomerEntity owner) {

    this.owner = owner;
  }

  /**
   * @return price
   */
  public double getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  public void setPrice(double price) {

    this.price = price;
  }

  /**
   * @return status
   */
  public OrderStatus getStatus() {

    return this.status;
  }

  /**
   * @param status new value of {@link #getstatus}.
   */
  public void setStatus(OrderStatus status) {

    this.status = status;
  }

  @Override
  @Transient
  public Long getOwnerId() {

    if (this.owner == null) {
      return null;
    }
    return this.owner.getId();
  }

  @Override
  public void setOwnerId(Long ownerId) {

    if (ownerId == null) {
      this.owner = null;
    } else {
      CustomerEntity customerEntity = new CustomerEntity();
      customerEntity.setId(ownerId);
      this.owner = customerEntity;
    }
  }

}
