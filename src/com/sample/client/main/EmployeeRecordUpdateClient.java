package com.sample.client.main;

import com.sample.client.EmpRecordUpdateHandler;
import com.sample.service.api.EmpRecordUpdateRes;

public class EmployeeRecordUpdateClient {

	public static void main(String[] args) {
		
		EmpRecordUpdateHandler hanlder = new EmpRecordUpdateHandler();
		EmpRecordUpdateRes response = null;
		try {
			response = hanlder.updateRecord(83,8000);			
			System.out.println("Record update Status for the id "+response.getId()+":: "+response.getUpdateStatus());
		}
		catch(Exception e){
			System.out.println("There seems to an error, checkout the logs");
			e.printStackTrace();
		}
		
	}

}
