package com.devonfw.app.java.order.orderservice.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummarySearchCriteriaTo;

public interface UcFindOrderSummary {

  /**
   * Returns a OrderSummary by its id 'id'.
   *
   * @param id The id 'id' of the OrderSummary.
   * @return The {@link OrderSummaryEto} with id 'id'
   */
  OrderSummaryEto findOrderSummary(long id);

  /**
   * Returns a paginated list of OrderSummarys matching the search criteria.
   *
   * @param criteria the {@link OrderSummarySearchCriteriaTo}.
   * @return the {@link List} of matching {@link OrderSummaryEto}s.
   */
  Page<OrderSummaryEto> findOrderSummarys(OrderSummarySearchCriteriaTo criteria);

}
