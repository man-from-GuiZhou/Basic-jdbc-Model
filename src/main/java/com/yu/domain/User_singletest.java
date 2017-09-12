package com.yu.domain;

public class User_singletest {
	
	private int testpage_id;//试卷id
	private int total_testpage_id;//整场考试id
	private int testpage_template_id;//考试模板id
	private int testpage_type;//考试类型
	private int score;//考试分数
	private String testpage_job;//目标职位
	
	public int getTestpage_id() {
		return testpage_id; 
	}
	public void setTestpage_id(int testpage_id) {
		this.testpage_id = testpage_id;
	}
	public int getTotal_testpage_id() {
		return total_testpage_id;
	}
	public void setTotal_testpage_id(int total_testpage_id) {
		this.total_testpage_id = total_testpage_id;
	}
	public int getTestpage_template_id() {
		return testpage_template_id;
	}
	public void setTestpage_template_id(int testpage_template_id) {
		this.testpage_template_id = testpage_template_id;
	}
	public int getTestpage_type() {
		return testpage_type;
	}
	public void setTestpage_type(int testpage_type) {
		this.testpage_type = testpage_type;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTestpage_job() {
		return testpage_job;
	}
	public void setTestpage_job(String testpage_job) {
		this.testpage_job = testpage_job;
	}
}
