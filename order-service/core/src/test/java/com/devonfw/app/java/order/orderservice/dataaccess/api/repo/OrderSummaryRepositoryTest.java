package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderSummaryEntity;
import com.devonfw.module.test.common.base.ComponentTest;

/**
 * @author IMATUJEW
 *
 */
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class OrderSummaryRepositoryTest extends ComponentTest {

  @Inject
  OrderSummaryRepository orderSummaryRepository;

  @Test
  public void shouldFindAllOrders() {

    List<OrderSummaryEntity> allOrders = this.orderSummaryRepository.findAll();
    assertNotNull(allOrders);
    assertThat(allOrders).hasSize(1);
  }

}
