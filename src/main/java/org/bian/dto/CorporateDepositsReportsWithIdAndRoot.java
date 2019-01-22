package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorporateDepositsReportsWithIdAndRoot
 */
public class CorporateDepositsReportsWithIdAndRoot   {
  private String productInstanceReference = null;

  private String reportInstanceReference = null;

  private String reportType = null;

  private String reportOptionsSelectionCriteria = null;

  private String reportPeriod = null;

  private String reportFormatTemplate = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Report Instance Reference 
   * @return reportInstanceReference
  **/

  public String getReportInstanceReference() {
    return reportInstanceReference;
  }

  public void setReportInstanceReference(String reportInstanceReference) {
    this.reportInstanceReference = reportInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Report Type 
   * @return reportType
  **/

  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines content 
   * @return reportOptionsSelectionCriteria
  **/

  public String getReportOptionsSelectionCriteria() {
    return reportOptionsSelectionCriteria;
  }

  public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
    this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: from-to 
   * @return reportPeriod
  **/

  public String getReportPeriod() {
    return reportPeriod;
  }

  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines presentation 
   * @return reportFormatTemplate
  **/

  public String getReportFormatTemplate() {
    return reportFormatTemplate;
  }

  public void setReportFormatTemplate(String reportFormatTemplate) {
    this.reportFormatTemplate = reportFormatTemplate;
  }


}

