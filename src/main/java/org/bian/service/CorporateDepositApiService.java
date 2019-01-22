/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateDepositApiService {

	CorporateDepositsDepositsWithIdAndRoot executePostDeposits(String crReferenceId, CorporateDepositsDepositsBase request);
	
	CorporateDepositsDepositsWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, CorporateDepositsDepositsBase request);
	
	CorporateDepositsWithdrawalWithIdAndRoot executePostWithdrawals(String crReferenceId, CorporateDepositsWithdrawalBase request);
	
	CorporateDepositsWithdrawalWithIdAndRoot executePutWithdrawals(String crReferenceId, String bqReferenceId, CorporateDepositsWithdrawalBase request);
	
	CorporateDepositsCorporateDepositsWithIdAndRoot initiate(CorporateDepositsCorporateDepositsBase request);
	
	CorporateDepositsRecordResponse record(String crReferenceId, CorporateDepositsRecordRequest request);
	
	CorporateDepositsDirectDebitWithIdAndRoot requestPostDirectDebits(String crReferenceId, CorporateDepositsDirectDebitBase request);
	
	CorporateDepositsDirectDebitWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, CorporateDepositsDirectDebitBase request);
	
	CorporateDepositsInventoryWithIdAndRoot requestPostInventories(String crReferenceId, CorporateDepositsInventoryBase request);
	
	CorporateDepositsInventoryWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, CorporateDepositsInventoryBase request);
	
	CorporateDepositsLiensWithIdAndRoot requestPostLiens(String crReferenceId, CorporateDepositsLiensBase request);
	
	CorporateDepositsLiensWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, CorporateDepositsLiensBase request);
	
	CorporateDepositsStandingOrderWithIdAndRoot requestPostStandingOrders(String crReferenceId, CorporateDepositsStandingOrderBase request);
	
	CorporateDepositsStandingOrderWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, CorporateDepositsStandingOrderBase request);
	
	CorporateDepositsSweepsWithIdAndRoot requestPostSweeps(String crReferenceId, CorporateDepositsSweepsBase request);
	
	CorporateDepositsSweepsWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, CorporateDepositsSweepsBase request);
	
	CorporateDepositsCorporateDepositsWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CorporateDepositsDepositsWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsDirectDebitWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsFeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsInventoryWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsLiensWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CorporateDepositsReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsStandingOrderWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsStatementsWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsSweepsWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId);
	
	CorporateDepositsWithdrawalWithIdAndRoot retrieveWithdrawals(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	CorporateDepositsCorporateDepositsWithIdAndRoot update(String crReferenceId, CorporateDepositsCorporateDepositsBase request);
	
}
