package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;

/**
 * @author IMATUJEW
 *
 */
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class CustomerRepositoryTest {

  @Inject
  private CustomerRepository customerRepository;

  @Test
  public void shouldFindAllItems() {

    // when
    List<CustomerEntity> foundCustomers = this.customerRepository.findAll();

    // then
    assertNotNull(foundCustomers);
  }

}
