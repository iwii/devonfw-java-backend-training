package com.devonfw.app.java.order.common.builders;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderSummaryEntity;

/**
 * Test data builder for CustomerEntity generated with cobigen.
 */
public class CustomerEntityBuilder {

  private List<Consumer<CustomerEntity>> parameterToBeApplied;

  /**
   * The constructor.
   */
  public CustomerEntityBuilder() {

    this.parameterToBeApplied = new LinkedList<>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  /**
   * @param firstName the firstName to add.
   * @return the builder for fluent population of fields.
   */
  public CustomerEntityBuilder firstName(final String firstName) {

    this.parameterToBeApplied.add(target -> target.setFirstName(firstName));

    return this;
  }

  /**
   * @param lastName the lastName to add.
   * @return the builder for fluent population of fields.
   */
  public CustomerEntityBuilder lastName(final String lastName) {

    this.parameterToBeApplied.add(target -> target.setLastName(lastName));

    return this;
  }

  /**
   * @param orders the orders to add.
   * @return the builder for fluent population of fields.
   */
  public CustomerEntityBuilder orders(final Set<OrderSummaryEntity> orders) {

    this.parameterToBeApplied.add(target -> target.setOrders(orders));

    return this;
  }

  /**
   * @return the populated CustomerEntity.
   */
  public CustomerEntity createNew() {

    CustomerEntity customerentity = new CustomerEntity();
    for (Consumer<CustomerEntity> parameter : parameterToBeApplied) {
      parameter.accept(customerentity);
    }
    return customerentity;
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
