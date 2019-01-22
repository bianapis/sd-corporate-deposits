/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CorporateDepositApiController {

	@Autowired
	CorporateDepositApiService service;
	
	@BQ("deposits")
	@Fulfill.ExecutePost
	public BianResponse<CorporateDepositsDepositsWithIdAndRoot> executePostDeposits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsDepositsBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostDeposits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposits")
	@Fulfill.ExecutePut
	public BianResponse<CorporateDepositsDepositsWithIdAndRoot> executePutDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsDepositsBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutDeposits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.ExecutePost
	public BianResponse<CorporateDepositsWithdrawalWithIdAndRoot> executePostWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsWithdrawalBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostWithdrawals(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.ExecutePut
	public BianResponse<CorporateDepositsWithdrawalWithIdAndRoot> executePutWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsWithdrawalBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutWithdrawals(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CorporateDepositsCorporateDepositsWithIdAndRoot> initiate(@RequestBody BianRequest<CorporateDepositsCorporateDepositsBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<CorporateDepositsRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPost
	public BianResponse<CorporateDepositsDirectDebitWithIdAndRoot> requestPostDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsDirectDebitBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDirectDebits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPut
	public BianResponse<CorporateDepositsDirectDebitWithIdAndRoot> requestPutDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsDirectDebitBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDirectDebits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPost
	public BianResponse<CorporateDepositsInventoryWithIdAndRoot> requestPostInventories(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsInventoryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostInventories(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPut
	public BianResponse<CorporateDepositsInventoryWithIdAndRoot> requestPutInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsInventoryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutInventories(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPost
	public BianResponse<CorporateDepositsLiensWithIdAndRoot> requestPostLiens(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsLiensBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostLiens(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPut
	public BianResponse<CorporateDepositsLiensWithIdAndRoot> requestPutLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsLiensBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutLiens(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPost
	public BianResponse<CorporateDepositsStandingOrderWithIdAndRoot> requestPostStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsStandingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostStandingOrders(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPut
	public BianResponse<CorporateDepositsStandingOrderWithIdAndRoot> requestPutStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsStandingOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutStandingOrders(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPost
	public BianResponse<CorporateDepositsSweepsWithIdAndRoot> requestPostSweeps(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsSweepsBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostSweeps(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPut
	public BianResponse<CorporateDepositsSweepsWithIdAndRoot> requestPutSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CorporateDepositsSweepsBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutSweeps(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsCorporateDepositsWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("deposits")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsDepositsWithIdAndRoot> retrieveDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposits(crReferenceId, bqReferenceId));
	}
	
	@BQ("direct-debits")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsDirectDebitWithIdAndRoot> retrieveDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDirectDebits(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsFeesWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("interests")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsInterestWithIdAndRoot> retrieveInterests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterests(crReferenceId, bqReferenceId));
	}
	
	@BQ("inventories")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsInventoryWithIdAndRoot> retrieveInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventories(crReferenceId, bqReferenceId));
	}
	
	@BQ("liens")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsLiensWithIdAndRoot> retrieveLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLiens(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reports")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsReportsWithIdAndRoot> retrieveReports(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReports(crReferenceId, bqReferenceId));
	}
	
	@BQ("standing-orders")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsStandingOrderWithIdAndRoot> retrieveStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStandingOrders(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsStatementsWithIdAndRoot> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@BQ("sweeps")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsSweepsWithIdAndRoot> retrieveSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSweeps(crReferenceId, bqReferenceId));
	}
	
	@BQ("withdrawals")
	@Fulfill.Retrieve
	public BianResponse<CorporateDepositsWithdrawalWithIdAndRoot> retrieveWithdrawals(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWithdrawals(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CorporateDepositsCorporateDepositsWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateDepositsCorporateDepositsBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
