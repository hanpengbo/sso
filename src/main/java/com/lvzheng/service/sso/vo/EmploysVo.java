package com.lvzheng.service.sso.vo;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

public class EmploysVo {

	private long empid;
	private String empname;
	private String password;
	private String caree;
	private int careeid;
	private String realname;
	private int gender;
	private int age;
	private int bornyear;
	private int cityid;
	private int localid;
	private String serviceids;
	private String phonenumber;
	private String email;
	private int actiontimes;
	private String address;
	private String addip;
	private String addtime;
	private String openid;
	private int jiedanstatus;
	private String isgoodat;
	private int orderslimit;
	
	private String callusername;
	private String calluserpass;
	private String calllogintype;
	
	private String roleids;
	
	public boolean isRole(String roleId){
		if(StringUtils.isNotBlank(roleids)){
			if(roleids.equals(roleId)){
				return true;
			}else if(Arrays.asList(roleids.split(",")).contains(roleId)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isRole(String roleIds,String roleId){
		if(StringUtils.isNotBlank(roleIds)){
			if(roleIds.equals(roleId)){
				return true;
			}else if(Arrays.asList(roleIds.split(",")).contains(roleId)){
				return true;
			}
		}
		return false;
	}
	
	public int getJiedanstatus() {
		return jiedanstatus;
	}
	public void setJiedanstatus(int jiedanstatus) {
		this.jiedanstatus = jiedanstatus;
	}
	public String getOpenid() {
		return openid;
	}
	public String getIsgoodat() {
		return isgoodat;
	}
	public void setIsgoodat(String isgoodat) {
		this.isgoodat = isgoodat;
	}
	public int getOrderslimit() {
		return orderslimit;
	}
	public void setOrderslimit(int orderslimit) {
		this.orderslimit = orderslimit;
	}
	public String getRoleids() {
		return roleids;
	}
	public void setRoleids(String roleids) {
		this.roleids = roleids;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBornyear() {
		return bornyear;
	}
	public void setBornyear(int bornyear) {
		this.bornyear = bornyear;
	}
	public String getServiceids() {
		return serviceids;
	}
	public void setServiceids(String serviceids) {
		this.serviceids = serviceids;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCaree() {
		return caree;
	}
	public void setCaree(String caree) {
		this.caree = caree;
	}
	public int getCareeid() {
		return careeid;
	}
	public void setCareeid(int careeid) {
		this.careeid = careeid;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getLocalid() {
		return localid;
	}
	public void setLocalid(int localid) {
		this.localid = localid;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getActiontimes() {
		return actiontimes;
	}
	public void setActiontimes(int actiontimes) {
		this.actiontimes = actiontimes;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddip() {
		return addip;
	}
	public void setAddip(String addip) {
		this.addip = addip;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getCallusername() {
		return callusername;
	}
	public void setCallusername(String callusername) {
		this.callusername = callusername;
	}
	public String getCalluserpass() {
		return calluserpass;
	}
	public void setCalluserpass(String calluserpass) {
		this.calluserpass = calluserpass;
	}
	public String getCalllogintype() {
		return calllogintype;
	}
	public void setCalllogintype(String calllogintype) {
		this.calllogintype = calllogintype;
	}
	
	
}
