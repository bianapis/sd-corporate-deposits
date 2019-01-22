package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsFeesWithIdAndRoot
 */
public class CorporateDepositsFeesWithIdAndRoot   {
  private String feeTransactionReference = null;

  private String productInstanceReference = null;

  private String feeConfiguration = null;

  private String feeType = null;

  private String feeCharge = null;

  private String feeDate = null;

  private String feeProjectionsCommitments = null;

  private String feeAccrualAmount = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Fee Transaction Reference 
   * @return feeTransactionReference
  **/

  public String getFeeTransactionReference() {
    return feeTransactionReference;
  }

  public void setFeeTransactionReference(String feeTransactionReference) {
    this.feeTransactionReference = feeTransactionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: customer level fee structure that is applied to the facility 
   * @return feeConfiguration
  **/

  public String getFeeConfiguration() {
    return feeConfiguration;
  }

  public void setFeeConfiguration(String feeConfiguration) {
    this.feeConfiguration = feeConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fee Type 
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Fee Charge 
   * @return feeCharge
  **/

  public String getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(String feeCharge) {
    this.feeCharge = feeCharge;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: date the fee calculated and applied 
   * @return feeDate
  **/

  public String getFeeDate() {
    return feeDate;
  }

  public void setFeeDate(String feeDate) {
    this.feeDate = feeDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fee Projections/Commitments 
   * @return feeProjectionsCommitments
  **/

  public String getFeeProjectionsCommitments() {
    return feeProjectionsCommitments;
  }

  public void setFeeProjectionsCommitments(String feeProjectionsCommitments) {
    this.feeProjectionsCommitments = feeProjectionsCommitments;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Fee Accrual Amount 
   * @return feeAccrualAmount
  **/

  public String getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(String feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


}

