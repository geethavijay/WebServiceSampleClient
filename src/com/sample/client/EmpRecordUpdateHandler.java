package com.sample.client;

import org.omg.CORBA.Request;

import com.sample.service.api.EmpRecordUpdateReq;
import com.sample.service.api.EmpRecordUpdateRes;
import com.sample.service.impl.EmployeeRecUpdatorImplService;
import com.sample.service.impl.IEmployeeUpdator;

public class EmpRecordUpdateHandler {
	
	public EmpRecordUpdateRes updateRecord(long id,long salary) throws Exception{
		EmpRecordUpdateRes response = null;
		try {
			EmployeeRecUpdatorImplService service = new EmployeeRecUpdatorImplService();
			IEmployeeUpdator empUpdator = service.getEmployeeRecUpdatorImplPort();
			EmployeeRecordUpdateReq req = new EmployeeRecordUpdateReq();
			response = empUpdator.updateEmployeeRecord(	req.getUpdateReq(id,salary));
		}
		catch(Exception e){
			System.out.println("Exception in invoking the service :"+e.getMessage());
			e.printStackTrace();
			throw e;
		}
		
		return response;
	}
	
	
	
}
