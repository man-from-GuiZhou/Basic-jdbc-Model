package com.yu.domain;

public class Subjective_testq {
	
	private int page_question_id;//试卷题目id
	private int question_id;//题目id
	private int testpage_id;//试卷id
	private String user_answer;//用户答案
	private int user_score;//用户得分
	private int correct_user_id;//阅卷用户id
	private String correct_text;//阅卷用户答案
	
	public int getPage_question_id() {
		return page_question_id;
	}
	public void setPage_question_id(int page_question_id) {
		this.page_question_id = page_question_id;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getTestpage_id() {
		return testpage_id;
	}
	public void setTestpage_id(int testpage_id) {
		this.testpage_id = testpage_id;
	}
	public String getUser_answer() {
		return user_answer;
	}
	public void setUser_answer(String user_answer) {
		this.user_answer = user_answer;
	}
	public int getUser_score() {
		return user_score;
	}
	public void setUser_score(int user_score) {
		this.user_score = user_score;
	}
	public int getCorrect_user_id() {
		return correct_user_id;
	}
	public void setCorrect_user_id(int correct_user_id) {
		this.correct_user_id = correct_user_id;
	}
	public String getCorrect_text() {
		return correct_text;
	}
	public void setCorrect_text(String correct_text) {
		this.correct_text = correct_text;
	}
}
