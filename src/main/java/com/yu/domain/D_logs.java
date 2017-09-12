package com.yu.domain;

import java.sql.Timestamp;

public class D_logs {
	
	private int log_id;//记录id
	private int user_id;//用户id
	private int login_ip;//登录的ip地址
	private int type;//操作权限
	private String operation;//具体的操作
	private Timestamp create_date;//条目创建时间
	private String remark;//备注
	
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(int login_ip) {
		this.login_ip = login_ip;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
