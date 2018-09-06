package com.han.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/xxx")
@Results({
	@Result(name="input",location="/input.jsp")		
})
@ExceptionMappings({
	@ExceptionMapping(exception="",result="error")
	
})
@ParentPackage("struts-default")
public class Abc extends ActionSupport {
	
	private String key1;
	private String key2;
	
	@Override
	@Action(value ="/login",
			results={
				@Result(name="success",location="/xxxyyy.jsp"),
				@Result(name="error",location="/yyyxxx.jsp")
			},
			params={"key1","value1","key2","value2"},
			exceptionMappings={
					@ExceptionMapping(exception="ArrayIndexOutOfBoundsException",result="error")
			}
	
	)
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(key1);
		System.out.println(key2);
		System.out.println("Abc.extcute()");
		
//		int[] abc= {343};
//		System.out.println(abc[9]);
//		
		
		return INPUT;
	}
	
	private String login(){
		return SUCCESS;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	
	
}
