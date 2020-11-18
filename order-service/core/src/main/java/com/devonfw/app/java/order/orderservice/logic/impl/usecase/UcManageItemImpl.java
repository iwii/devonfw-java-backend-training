package com.devonfw.app.java.order.orderservice.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageItem;
import com.devonfw.app.java.order.orderservice.logic.base.usecase.AbstractItemUc;

/**
 * @author IMATUJEW
 *
 */
@Named
@Validated
@Transactional
public class UcManageItemImpl extends AbstractItemUc implements UcManageItem {

  private static final Logger LOG = LoggerFactory.getLogger(UcManageCustomerImpl.class);

  @Override
  public boolean deleteItem(long itemId) {

    // TODO Auto-generated method stub
    ItemEntity itemEntity = getItemRepository().find(itemId);
    getItemRepository().delete(itemEntity);
    LOG.debug("The item with id '{}' has been deleted.", itemId);
    return true;
  }

  @Override
  public ItemEto saveItem(ItemEto item) {

    Objects.requireNonNull(item, "item");
    ItemEntity itemEntity = getBeanMapper().map(item, ItemEntity.class);
    ItemEntity result = getItemRepository().save(itemEntity);
    LOG.debug("Item with id '{}' has been created.", result.getId());
    return getBeanMapper().map(result, ItemEto.class);
  }

}
