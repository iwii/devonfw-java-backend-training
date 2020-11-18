package com.devonfw.app.java.order.orderservice.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.app.java.order.general.logic.base.AbstractUc;
import com.devonfw.app.java.order.orderservice.dataaccess.api.repo.OrderSummaryRepository;

/**
 * Abstract use case for OrderSummarys, which provides access to the commonly necessary data access objects.
 */
public class AbstractOrderSummaryUc extends AbstractUc {

  /** @see #getOrderSummaryRepository() */
  @Inject
  private OrderSummaryRepository orderSummaryRepository;

  /**
   * Returns the field 'orderSummaryRepository'.
   * 
   * @return the {@link OrderSummaryRepository} instance.
   */
  public OrderSummaryRepository getOrderSummaryRepository() {

    return this.orderSummaryRepository;
  }

}
