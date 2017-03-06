package jexcelunit.excel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestcaseVO {

	private String testname;
	private Class testclass;
	private Constructor con;
	

	private Class[] cons_param;
	private Method met;
	private Class[] met_param;
	private Object result;	
	private Object expect;
	
	private ArrayList<Object> constructor_params =null;
	private ArrayList<Object> method_params = null;
	
	
	
//	private String testmethod;
	

	private boolean success;
	
	public TestcaseVO(){
		constructor_params= new ArrayList<>();
		method_params = new ArrayList<>();
	}
	
	public void addConstructorParam(Object data){
		constructor_params.add(data);
	}
	public ArrayList<Object> getConstructorParams(){
		return constructor_params;
	}
	
	public void addMethodParam(Object data){
		method_params.add(data);
	}
	public ArrayList<Object> getMethodParams(){
		return method_params;
	}
	
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public Class getTestclass() {
		return testclass;
	}
	public void setTestclass(Class testclass) {
		this.testclass = testclass;
	}

	public Object getExpect() {
		return expect;
	}
	public void setExpect(Object expect) {
		this.expect = expect;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	
	public Constructor getCon() {
		return con;
	}

	public void setCon(Constructor con) {
		this.con = con;
	}

	public Class[] getCons_param() {
		return cons_param;
	}

	public void setCons_param(Class[] cons_param) {
		this.cons_param = cons_param;
	}

	public Method getMet() {
		return met;
	}

	public void setMet(Method met) {
		this.met = met;
	}

	public Class[] getMet_param() {
		return met_param;
	}

	public void setMet_param(Class[] met_param) {
		this.met_param = met_param;
	}
	
}