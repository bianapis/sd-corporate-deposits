package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsCorporateDepositsBase
 */
public class CorporateDepositsCorporateDepositsBase   {
  private String corporateDepositAccountNumber = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String dateType = null;

  private String date = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String partyReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String accountLimitType = null;

  private String accountLimit = null;

  private String allowedAccess = null;

  private String optionType = null;

  private String option = null;

  private String taxReference = null;

  private String accountStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: numerical reference, using industry standard for external reference e.g. IBAN 
   * @return corporateDepositAccountNumber
  **/

  public String getCorporateDepositAccountNumber() {
    return corporateDepositAccountNumber;
  }

  public void setCorporateDepositAccountNumber(String corporateDepositAccountNumber) {
    this.corporateDepositAccountNumber = corporateDepositAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the corporate entity owning the account 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. open, closing 
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Date 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: e.g. guarantor/cosigner 
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Involved Party Obligation/Entitlement 
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party Reference 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Account Type 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Account Currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. transaction credit/debit, netting, position 
   * @return accountLimitType
  **/

  public String getAccountLimitType() {
    return accountLimitType;
  }

  public void setAccountLimitType(String accountLimitType) {
    this.accountLimitType = accountLimitType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Account Limit 
   * @return accountLimit
  **/

  public String getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(String accountLimit) {
    this.accountLimit = accountLimit;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: access roles and their allowed actions against the product 
   * @return allowedAccess
  **/

  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. selected charges included/excluded 
   * @return optionType
  **/

  public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: settings for the realization of the selected product option 
   * @return option
  **/

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Tax 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. pre-opened, active, dormant, pending for closing, blocked 
   * @return accountStatus
  **/

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }


}

