package com.sample.client;

import com.sample.service.api.EmpRecordUpdateReq;

public class EmployeeRecordUpdateReq {
	
	 public  EmpRecordUpdateReq getUpdateReq(long id,long salary){
		 EmpRecordUpdateReq req = new EmpRecordUpdateReq();
		 req.setId(id);
		 req.setSalary(salary);		 
		 return req;
	 }
	 
}
