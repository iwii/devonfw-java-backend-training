package com.devonfw.app.java.order.common.builders;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.devonfw.app.java.order.orderservice.common.api.OrderStatus;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;

/**
 * Test data builder for OrderSummaryEto generated with cobigen.
 */
public class OrderSummaryEtoBuilder {

  private List<Consumer<OrderSummaryEto>> parameterToBeApplied;

  /**
   * The constructor.
   */
  public OrderSummaryEtoBuilder() {

    this.parameterToBeApplied = new LinkedList<>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  /**
   * @param creationDate the creationDate to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEtoBuilder creationDate(final LocalDate creationDate) {

    this.parameterToBeApplied.add(target -> target.setCreationDate(creationDate));

    return this;
  }

  /**
   * @param ownerId the ownerId to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEtoBuilder ownerId(final Long ownerId) {

    this.parameterToBeApplied.add(target -> target.setOwnerId(ownerId));

    return this;
  }

  /**
   * @param price the price to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEtoBuilder price(final double price) {

    this.parameterToBeApplied.add(target -> target.setPrice(price));

    return this;
  }

  /**
   * @param status the status to add.
   * @return the builder for fluent population of fields.
   */
  public OrderSummaryEtoBuilder status(final OrderStatus status) {

    this.parameterToBeApplied.add(target -> target.setStatus(status));

    return this;
  }

  /**
   * @return the populated OrderSummaryEto.
   */
  public OrderSummaryEto createNew() {

    OrderSummaryEto ordersummaryeto = new OrderSummaryEto();
    for (Consumer<OrderSummaryEto> parameter : parameterToBeApplied) {
      parameter.accept(ordersummaryeto);
    }
    return ordersummaryeto;
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
