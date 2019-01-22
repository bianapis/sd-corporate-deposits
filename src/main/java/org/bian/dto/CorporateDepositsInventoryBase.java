package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsInventoryBase
 */
public class CorporateDepositsInventoryBase   {
  private String inventoryItemType = null;

  private String inventoryItemProperties = null;

  private String inventoryItemStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. pay-in slip, cheque 
   * @return inventoryItemType
  **/

  public String getInventoryItemType() {
    return inventoryItemType;
  }

  public void setInventoryItemType(String inventoryItemType) {
    this.inventoryItemType = inventoryItemType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. sequence numbers 
   * @return inventoryItemProperties
  **/

  public String getInventoryItemProperties() {
    return inventoryItemProperties;
  }

  public void setInventoryItemProperties(String inventoryItemProperties) {
    this.inventoryItemProperties = inventoryItemProperties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. issued, cancelled 
   * @return inventoryItemStatus
  **/

  public String getInventoryItemStatus() {
    return inventoryItemStatus;
  }

  public void setInventoryItemStatus(String inventoryItemStatus) {
    this.inventoryItemStatus = inventoryItemStatus;
  }


}

