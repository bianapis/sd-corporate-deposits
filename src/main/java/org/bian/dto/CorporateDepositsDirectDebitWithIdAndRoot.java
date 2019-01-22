package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsDirectDebitWithIdAndRoot
 */
public class CorporateDepositsDirectDebitWithIdAndRoot   {
  private String directDebitFacilityReference = null;

  private String directDebitMandateReference = null;

  private String directDebitPurpose = null;

  private String directDebitServiceConfiguration = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private String amountLimit = null;

  private String currency = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Direct Debit Facility Reference 
   * @return directDebitFacilityReference
  **/

  public String getDirectDebitFacilityReference() {
    return directDebitFacilityReference;
  }

  public void setDirectDebitFacilityReference(String directDebitFacilityReference) {
    this.directDebitFacilityReference = directDebitFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: payee 
   * @return directDebitMandateReference
  **/

  public String getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(String directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. for compliance reporting 
   * @return directDebitPurpose
  **/

  public String getDirectDebitPurpose() {
    return directDebitPurpose;
  }

  public void setDirectDebitPurpose(String directDebitPurpose) {
    this.directDebitPurpose = directDebitPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: limits/schedule 
   * @return directDebitServiceConfiguration
  **/

  public String getDirectDebitServiceConfiguration() {
    return directDebitServiceConfiguration;
  }

  public void setDirectDebitServiceConfiguration(String directDebitServiceConfiguration) {
    this.directDebitServiceConfiguration = directDebitServiceConfiguration;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: corporate customer holding the account 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Payee Reference 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: payee account 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Payee Bank Reference 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: details the maximum allowed amount/frequency for direct debits 
   * @return amountLimit
  **/

  public String getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(String amountLimit) {
    this.amountLimit = amountLimit;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Currency 
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


}

