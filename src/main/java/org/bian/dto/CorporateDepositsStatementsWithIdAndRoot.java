package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsStatementsWithIdAndRoot
 */
public class CorporateDepositsStatementsWithIdAndRoot   {
  private String balanceType = null;

  private String balance = null;

  private String productInstanceReference = null;

  private String statementInstanceReference = null;

  private String statementType = null;

  private String statementTransactionType = null;

  private String statementPeriod = null;

  private String transactionRecordReference = null;

  private String transactionType = null;

  private String transactionPrincipleAmount = null;

  private String transactionCounterparty = null;

  private String transactionObligation = null;

  private String transactionDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. booked, available, closing, pending block 
   * @return balanceType
  **/

  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: amount of the balance 
   * @return balance
  **/

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Statement Instance Reference 
   * @return statementInstanceReference
  **/

  public String getStatementInstanceReference() {
    return statementInstanceReference;
  }

  public void setStatementInstanceReference(String statementInstanceReference) {
    this.statementInstanceReference = statementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. balance/periodic statement/annual report 
   * @return statementType
  **/

  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: content 
   * @return statementTransactionType
  **/

  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from-to 
   * @return statementPeriod
  **/

  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Transaction Record Reference 
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Transaction Type 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Transaction Principle Amount 
   * @return transactionPrincipleAmount
  **/

  public String getTransactionPrincipleAmount() {
    return transactionPrincipleAmount;
  }

  public void setTransactionPrincipleAmount(String transactionPrincipleAmount) {
    this.transactionPrincipleAmount = transactionPrincipleAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. payee, merchant 
   * @return transactionCounterparty
  **/

  public String getTransactionCounterparty() {
    return transactionCounterparty;
  }

  public void setTransactionCounterparty(String transactionCounterparty) {
    this.transactionCounterparty = transactionCounterparty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. purchased service/product 
   * @return transactionObligation
  **/

  public String getTransactionObligation() {
    return transactionObligation;
  }

  public void setTransactionObligation(String transactionObligation) {
    this.transactionObligation = transactionObligation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Transaction Date/Time 
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


}

