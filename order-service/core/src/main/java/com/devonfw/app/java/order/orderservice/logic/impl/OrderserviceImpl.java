package com.devonfw.app.java.order.orderservice.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.app.java.order.general.logic.base.AbstractComponentFacade;
import com.devonfw.app.java.order.orderservice.logic.api.Orderservice;
import com.devonfw.app.java.order.orderservice.logic.api.to.CustomerEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.CustomerSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummaryEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderSummarySearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindCustomer;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindItem;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindOrderSummary;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageCustomer;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageItem;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageOrderSummary;

/**
 * Implementation of component interface of orderservice
 */
@Named
public class OrderserviceImpl extends AbstractComponentFacade implements Orderservice {

  @Inject
  UcFindItem UcFindItem;

  @Inject
  UcManageItem UcManageItem;

  @Inject
  private UcFindCustomer ucFindCustomer;

  @Inject
  private UcManageCustomer ucManageCustomer;

  @Inject
  private UcFindOrderSummary ucFindOrderSummary;

  @Inject
  private UcManageOrderSummary ucManageOrderSummary;

  @Override
  public ItemEto findItem(long id) {

    // TODO Auto-generated method stub
    return this.UcFindItem.findItem(id);
  }

  @Override
  public Page<ItemEto> findItems(ItemSearchCriteriaTo criteria) {

    // TODO Auto-generated method stub
    return this.UcFindItem.findItems(criteria);
  }

  @Override
  public boolean deleteItem(long itemId) {

    // TODO Auto-generated method stub
    return this.UcManageItem.deleteItem(itemId);
  }

  @Override
  public ItemEto saveItem(ItemEto item) {

    // TODO Auto-generated method stub
    return this.UcManageItem.saveItem(item);
  }

  @Override
  public CustomerEto findCustomer(long id) {

    return this.ucFindCustomer.findCustomer(id);
  }

  @Override
  public Page<CustomerEto> findCustomers(CustomerSearchCriteriaTo criteria) {

    return this.ucFindCustomer.findCustomers(criteria);
  }

  @Override
  public CustomerEto saveCustomer(CustomerEto customer) {

    return this.ucManageCustomer.saveCustomer(customer);
  }

  @Override
  public boolean deleteCustomer(long id) {

    return this.ucManageCustomer.deleteCustomer(id);
  }

  @Override
  public OrderSummaryEto findOrderSummary(long id) {

    return this.ucFindOrderSummary.findOrderSummary(id);
  }

  @Override
  public Page<OrderSummaryEto> findOrderSummarys(OrderSummarySearchCriteriaTo criteria) {

    return this.ucFindOrderSummary.findOrderSummarys(criteria);
  }

  @Override
  public OrderSummaryEto saveOrderSummary(OrderSummaryEto ordersummary) {

    return this.ucManageOrderSummary.saveOrderSummary(ordersummary);
  }

  @Override
  public boolean deleteOrderSummary(long id) {

    return this.ucManageOrderSummary.deleteOrderSummary(id);
  }

}
