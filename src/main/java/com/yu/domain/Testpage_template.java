package com.yu.domain;

public class Testpage_template {
	
	private int testpage_template_id;//试卷模板id
	private int testpage_type;//试卷类型
	private int objective_QNU;//客观题数量
	private int subjective_QNU;//主观题数量
	private String testpage_job;//试卷目标工作类型
	
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
	public int getObjective_QNU() {
		return objective_QNU;
	}
	public void setObjective_QNU(int objective_QNU) {
		this.objective_QNU = objective_QNU;
	}
	public int getSubjective_QNU() {
		return subjective_QNU;
	}
	public void setSubjective_QNU(int subjective_QNU) {
		this.subjective_QNU = subjective_QNU;
	}
	public String getTestpage_job() {
		return testpage_job;
	}
	public void setTestpage_job(String testpage_job) {
		this.testpage_job = testpage_job;
	}
}
