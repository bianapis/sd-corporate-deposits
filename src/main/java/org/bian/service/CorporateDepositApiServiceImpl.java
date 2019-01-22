/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateDepositApiServiceImpl implements CorporateDepositApiService {

	public CorporateDepositsDepositsWithIdAndRoot executePostDeposits(String crReferenceId, CorporateDepositsDepositsBase request){
		return JsonReader.read("executePost-CorporateDepositsDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsDepositsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsDepositsWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, CorporateDepositsDepositsBase request){
		return JsonReader.read("executePut-CorporateDepositsDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsDepositsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsWithdrawalWithIdAndRoot executePostWithdrawals(String crReferenceId, CorporateDepositsWithdrawalBase request){
		return JsonReader.read("executePost-CorporateDepositsWithdrawalWithIdAndRoot.json",new TypeReference<CorporateDepositsWithdrawalWithIdAndRoot>(){});
	}
	
	public CorporateDepositsWithdrawalWithIdAndRoot executePutWithdrawals(String crReferenceId, String bqReferenceId, CorporateDepositsWithdrawalBase request){
		return JsonReader.read("executePut-CorporateDepositsWithdrawalWithIdAndRoot.json",new TypeReference<CorporateDepositsWithdrawalWithIdAndRoot>(){});
	}
	
	public CorporateDepositsCorporateDepositsWithIdAndRoot initiate(CorporateDepositsCorporateDepositsBase request){
		return JsonReader.read("initiate-CorporateDepositsCorporateDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsCorporateDepositsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsRecordResponse record(String crReferenceId, CorporateDepositsRecordRequest request){
		return JsonReader.read("record-CorporateDepositsRecordResponse.json",new TypeReference<CorporateDepositsRecordResponse>(){});
	}
	
	public CorporateDepositsDirectDebitWithIdAndRoot requestPostDirectDebits(String crReferenceId, CorporateDepositsDirectDebitBase request){
		return JsonReader.read("requestPost-CorporateDepositsDirectDebitWithIdAndRoot.json",new TypeReference<CorporateDepositsDirectDebitWithIdAndRoot>(){});
	}
	
	public CorporateDepositsDirectDebitWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, CorporateDepositsDirectDebitBase request){
		return JsonReader.read("requestPut-CorporateDepositsDirectDebitWithIdAndRoot.json",new TypeReference<CorporateDepositsDirectDebitWithIdAndRoot>(){});
	}
	
	public CorporateDepositsInventoryWithIdAndRoot requestPostInventories(String crReferenceId, CorporateDepositsInventoryBase request){
		return JsonReader.read("requestPost-CorporateDepositsInventoryWithIdAndRoot.json",new TypeReference<CorporateDepositsInventoryWithIdAndRoot>(){});
	}
	
	public CorporateDepositsInventoryWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, CorporateDepositsInventoryBase request){
		return JsonReader.read("requestPut-CorporateDepositsInventoryWithIdAndRoot.json",new TypeReference<CorporateDepositsInventoryWithIdAndRoot>(){});
	}
	
	public CorporateDepositsLiensWithIdAndRoot requestPostLiens(String crReferenceId, CorporateDepositsLiensBase request){
		return JsonReader.read("requestPost-CorporateDepositsLiensWithIdAndRoot.json",new TypeReference<CorporateDepositsLiensWithIdAndRoot>(){});
	}
	
	public CorporateDepositsLiensWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, CorporateDepositsLiensBase request){
		return JsonReader.read("requestPut-CorporateDepositsLiensWithIdAndRoot.json",new TypeReference<CorporateDepositsLiensWithIdAndRoot>(){});
	}
	
	public CorporateDepositsStandingOrderWithIdAndRoot requestPostStandingOrders(String crReferenceId, CorporateDepositsStandingOrderBase request){
		return JsonReader.read("requestPost-CorporateDepositsStandingOrderWithIdAndRoot.json",new TypeReference<CorporateDepositsStandingOrderWithIdAndRoot>(){});
	}
	
	public CorporateDepositsStandingOrderWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, CorporateDepositsStandingOrderBase request){
		return JsonReader.read("requestPut-CorporateDepositsStandingOrderWithIdAndRoot.json",new TypeReference<CorporateDepositsStandingOrderWithIdAndRoot>(){});
	}
	
	public CorporateDepositsSweepsWithIdAndRoot requestPostSweeps(String crReferenceId, CorporateDepositsSweepsBase request){
		return JsonReader.read("requestPost-CorporateDepositsSweepsWithIdAndRoot.json",new TypeReference<CorporateDepositsSweepsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsSweepsWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, CorporateDepositsSweepsBase request){
		return JsonReader.read("requestPut-CorporateDepositsSweepsWithIdAndRoot.json",new TypeReference<CorporateDepositsSweepsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsCorporateDepositsWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsCorporateDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsCorporateDepositsWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CorporateDepositsDepositsWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsDepositsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsDirectDebitWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsDirectDebitWithIdAndRoot.json",new TypeReference<CorporateDepositsDirectDebitWithIdAndRoot>(){});
	}
	
	public CorporateDepositsFeesWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsFeesWithIdAndRoot.json",new TypeReference<CorporateDepositsFeesWithIdAndRoot>(){});
	}
	
	public CorporateDepositsInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsInterestWithIdAndRoot.json",new TypeReference<CorporateDepositsInterestWithIdAndRoot>(){});
	}
	
	public CorporateDepositsInventoryWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsInventoryWithIdAndRoot.json",new TypeReference<CorporateDepositsInventoryWithIdAndRoot>(){});
	}
	
	public CorporateDepositsLiensWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsLiensWithIdAndRoot.json",new TypeReference<CorporateDepositsLiensWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CorporateDepositsReportsWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsReportsWithIdAndRoot.json",new TypeReference<CorporateDepositsReportsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsStandingOrderWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsStandingOrderWithIdAndRoot.json",new TypeReference<CorporateDepositsStandingOrderWithIdAndRoot>(){});
	}
	
	public CorporateDepositsStatementsWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsStatementsWithIdAndRoot.json",new TypeReference<CorporateDepositsStatementsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsSweepsWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsSweepsWithIdAndRoot.json",new TypeReference<CorporateDepositsSweepsWithIdAndRoot>(){});
	}
	
	public CorporateDepositsWithdrawalWithIdAndRoot retrieveWithdrawals(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorporateDepositsWithdrawalWithIdAndRoot.json",new TypeReference<CorporateDepositsWithdrawalWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public CorporateDepositsCorporateDepositsWithIdAndRoot update(String crReferenceId, CorporateDepositsCorporateDepositsBase request){
		return JsonReader.read("update-CorporateDepositsCorporateDepositsWithIdAndRoot.json",new TypeReference<CorporateDepositsCorporateDepositsWithIdAndRoot>(){});
	}
	
}
