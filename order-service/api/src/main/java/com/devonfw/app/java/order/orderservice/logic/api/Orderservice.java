package com.devonfw.app.java.order.orderservice.logic.api;

import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindCustomer;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindItem;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindOrderSummary;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageCustomer;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageItem;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageOrderSummary;

/**
 * Interface for Orderservice component.
 */
public interface Orderservice
    extends UcFindItem, UcManageItem, UcFindCustomer, UcManageCustomer, UcFindOrderSummary, UcManageOrderSummary {

}
