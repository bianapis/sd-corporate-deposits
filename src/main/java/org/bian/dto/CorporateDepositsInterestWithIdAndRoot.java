package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsInterestWithIdAndRoot
 */
public class CorporateDepositsInterestWithIdAndRoot   {
  private String interestRateTransactionReference = null;

  private String productInstanceReference = null;

  private String rateRateConfiguration = null;

  private String applicableInterestRates = null;

  private String rateApplicationSchedule = null;

  private String accruedInterestAmount = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Interest Rate Transaction Reference 
   * @return interestRateTransactionReference
  **/

  public String getInterestRateTransactionReference() {
    return interestRateTransactionReference;
  }

  public void setInterestRateTransactionReference(String interestRateTransactionReference) {
    this.interestRateTransactionReference = interestRateTransactionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: service domain level rate application rules 
   * @return rateRateConfiguration
  **/

  public String getRateRateConfiguration() {
    return rateRateConfiguration;
  }

  public void setRateRateConfiguration(String rateRateConfiguration) {
    this.rateRateConfiguration = rateRateConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines interest rate types that apply to the account 
   * @return applicableInterestRates
  **/

  public String getApplicableInterestRates() {
    return applicableInterestRates;
  }

  public void setApplicableInterestRates(String applicableInterestRates) {
    this.applicableInterestRates = applicableInterestRates;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines timing for rate calculations 
   * @return rateApplicationSchedule
  **/

  public String getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(String rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: tracks the interest accruals for the account 
   * @return accruedInterestAmount
  **/

  public String getAccruedInterestAmount() {
    return accruedInterestAmount;
  }

  public void setAccruedInterestAmount(String accruedInterestAmount) {
    this.accruedInterestAmount = accruedInterestAmount;
  }


}

