package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsInventoryWithIdAndRoot
 */
public class CorporateDepositsInventoryWithIdAndRoot   {
  private String inventoryItemReference = null;

  private String productInstanceReference = null;

  private String inventoryItemType = null;

  private String inventoryItemProperties = null;

  private String inventoryItemStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: item identifier - provided by issuing Service Domain e.g. cheque reference numbers 
   * @return inventoryItemReference
  **/

  public String getInventoryItemReference() {
    return inventoryItemReference;
  }

  public void setInventoryItemReference(String inventoryItemReference) {
    this.inventoryItemReference = inventoryItemReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: corporate deposit account reference 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


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

