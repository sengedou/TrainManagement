package com.project.bean;

import java.sql.Date;

/**
 * �����ɼ�ʵ��
 * 
 * @author ����
 *
 */
public class MoriningTestBean {
	/**
	 * ����������
	 */
	private int mtid;
	/**
	 * �������������ѧ�������
	 */
	private StudentBean studentBean;
	/**
	 * ������
	 */
	private String question;
	/**
	 * ��������
	 */
	private double score;
	/**
	 * ����ʱ��
	 */
	private Date date;
	public int getMtid() {
		return mtid;
	}
	public void setMtid(int mtid) {
		this.mtid = mtid;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	

}
