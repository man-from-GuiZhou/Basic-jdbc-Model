package com.yu.domain;

public class Objective_testq {
	
	private int page_question_id;//试卷题目id
	private int question_id;//题目id
	private int testpage_id;//试卷id
	private char user_answer;//用户答案
	private int score;//得分
	
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
	public char getUser_answer() {
		return user_answer;
	}
	public void setUser_answer(char user_answer) {
		this.user_answer = user_answer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
