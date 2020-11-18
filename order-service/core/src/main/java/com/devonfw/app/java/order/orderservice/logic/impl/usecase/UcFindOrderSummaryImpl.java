package com.devonfw.app.java.order.orderservice.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderSummaryEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummarySearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindOrderSummary;
import com.devonfw.app.java.order.orderservice.logic.base.usecase.AbstractOrderSummaryUc;

/**
 * Use case implementation for searching, filtering and getting OrderSummarys
 */
@Named
@Validated
@Transactional
public class UcFindOrderSummaryImpl extends AbstractOrderSummaryUc implements UcFindOrderSummary {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindOrderSummaryImpl.class);

  @Override
  public OrderSummaryEto findOrderSummary(long id) {

    LOG.debug("Get OrderSummary with id {} from database.", id);
    Optional<OrderSummaryEntity> foundEntity = getOrderSummaryRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), OrderSummaryEto.class);
    else
      return null;
  }

  @Override
  public Page<OrderSummaryEto> findOrderSummarys(OrderSummarySearchCriteriaTo criteria) {

    Page<OrderSummaryEntity> ordersummarys = getOrderSummaryRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(ordersummarys, OrderSummaryEto.class);
  }

}
