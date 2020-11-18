package com.devonfw.app.java.order.orderservice.logic.api.usecase;

import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;

/**
 * Interface of UcManageOrderSummary to centralize documentation and signatures of methods.
 */
public interface UcManageOrderSummary {

  /**
   * Deletes a orderSummary from the database by its id 'orderSummaryId'.
   *
   * @param orderSummaryId Id of the orderSummary to delete
   * @return boolean <code>true</code> if the orderSummary can be deleted, <code>false</code> otherwise
   */
  boolean deleteOrderSummary(long orderSummaryId);

  /**
   * Saves a orderSummary and store it in the database.
   *
   * @param orderSummary the {@link OrderSummaryEto} to create.
   * @return the new {@link OrderSummaryEto} that has been saved with ID and version.
   */
  OrderSummaryEto saveOrderSummary(OrderSummaryEto orderSummary);

}
