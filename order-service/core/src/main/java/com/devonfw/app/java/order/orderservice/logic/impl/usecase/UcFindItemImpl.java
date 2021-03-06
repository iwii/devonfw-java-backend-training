package com.devonfw.app.java.order.orderservice.logic.impl.usecase;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcFindItem;
import com.devonfw.app.java.order.orderservice.logic.base.usecase.AbstractItemUc;

/**
 * @author IMATUJEW
 *
 */
@Named
@Validated
@Transactional
public class UcFindItemImpl extends AbstractItemUc implements UcFindItem {

  /**
   * Logger instance.
   */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindItemImpl.class);

  @Override
  public ItemEto findItem(long id) {

    LOG.debug("Get Item with id {} from database.", id);
    ItemEntity foundEntity = getItemRepository().getOne(id);
    return getBeanMapper().map(foundEntity, ItemEto.class);
  }

  @Override
  public Page<ItemEto> findItems(ItemSearchCriteriaTo criteria) {

    LOG.debug("Get Items with criteria {} from database.", criteria);
    Page<ItemEntity> items = getItemRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(items, ItemEto.class);
  }

}
