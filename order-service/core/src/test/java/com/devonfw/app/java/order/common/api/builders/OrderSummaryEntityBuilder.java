package com.devonfw.app.java.order.common.builders;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;
import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderSummaryEntity;

/**
 * Test data builder for OrderSummaryEntity generated with cobigen.
 */
public class OrderSummaryEntityBuilder {

  private List<Consumer<OrderSummaryEntity>> parameterToBeApplied;

  /**
   * The constructor.
   */
  public OrderSummaryEntityBuilder() {

    this.parameterToBeApplied = new LinkedList<>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  /**
   * @param creationDate the creationDate to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder creationDate(final LocalDate creationDate) {

    this.parameterToBeApplied.add(target -> target.setCreationDate(creationDate));

    return this;
  }

  /**
   * @param orderPositions the orderPositions to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder orderPositions(final Set<ItemEntity> orderPositions) {

    this.parameterToBeApplied.add(target -> target.setOrderPositions(orderPositions));

    return this;
  }

  /**
   * @param owner the owner to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder owner(final CustomerEntity owner) {

    this.parameterToBeApplied.add(target -> target.setOwner(owner));

    return this;
  }

  /**
   * @param price the price to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder price(final double price) {

    this.parameterToBeApplied.add(target -> target.setPrice(price));

    return this;
  }

  /**
   * @param status the status to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder status(final OrderStatus status) {

    this.parameterToBeApplied.add(target -> target.setStatus(status));

    return this;
  }

  /**
   * @param ownerId the ownerId to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEntityBuilder ownerId(final Long ownerId) {

    this.parameterToBeApplied.add(target -> target.setOwnerId(ownerId));

    return this;
  }

  /**
   * @return the populated OrderSummaryEntity.
   */
  public OrderSummaryEntity createNew() {

    OrderSummaryEntity ordersummaryentity = new OrderSummaryEntity();
    for (Consumer<OrderSummaryEntity> parameter : parameterToBeApplied) {
      parameter.accept(ordersummaryentity);
    }
    return ordersummaryentity;
  }

  /**
   * Might be enriched to users needs (will not be overwritten)
   */
  private void fillMandatoryFields_custom() {

  }

  /**
   * Fills all mandatory fields by default. (will be overwritten on re-generation)
   */
  private void fillMandatoryFields() {

  }

}
