package com.devonfw.app.java.order.orderservice.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderSummaryEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageOrderSummary;
import com.devonfw.app.java.order.orderservice.logic.base.usecase.AbstractOrderSummaryUc;

/**
 * Use case implementation for modifying and deleting OrderSummarys
 */
@Named
@Validated
@Transactional
public class UcManageOrderSummaryImpl extends AbstractOrderSummaryUc implements UcManageOrderSummary {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageOrderSummaryImpl.class);

  @Override
  public boolean deleteOrderSummary(long orderSummaryId) {

    OrderSummaryEntity orderSummary = getOrderSummaryRepository().find(orderSummaryId);
    getOrderSummaryRepository().delete(orderSummary);
    LOG.debug("The orderSummary with id '{}' has been deleted.", orderSummaryId);
    return true;
  }

  @Override
  public OrderSummaryEto saveOrderSummary(OrderSummaryEto orderSummary) {

    Objects.requireNonNull(orderSummary, "orderSummary");

    OrderSummaryEntity orderSummaryEntity = getBeanMapper().map(orderSummary, OrderSummaryEntity.class);

    // initialize, validate orderSummaryEntity here if necessary
    OrderSummaryEntity resultEntity = getOrderSummaryRepository().save(orderSummaryEntity);
    LOG.debug("OrderSummary with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, OrderSummaryEto.class);
  }
}
