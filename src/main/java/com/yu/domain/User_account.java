package com.yu.domain;

public class User_account {
	
	private int userId;//用户id
	private String userName;//用户名
	private String passWord;//用户密码
	private int perMission;//用户权限
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getPerMission() {
		return perMission;
	}
	public void setPerMission(int perMission) {
		this.perMission = perMission;
	}
	
}
