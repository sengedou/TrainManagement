package com.project.bean;

/**
 * �׶γɼ�ʵ��
 * @author ���� 
 *
 */
public class PeriodExamBean {
  
	/**
	 * �׶ο��˱�����
	 */
	 private int peid;
	 /**
	  * �������ѧ�������
	  */
	 private StudentBean studentBean;
	 /**
	  * �������׶α����
	  */
	 private PeriodBean periodBean;
	 /**
	  * �׶ο��˷���
	  */
	 private double score;
	 /**
	  * �׶ο�������
	  */
	 private String comment;
	 /**
	  * �׶ο����Ƿ�ͨ��
	  */
	 private String status;
	public int getPeid() {
		return peid;
	}
	public void setPeid(int peid) {
		this.peid = peid;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public PeriodBean getPeriodBean() {
		return periodBean;
	}
	public void setPeriodBean(PeriodBean periodBean) {
		this.periodBean = periodBean;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	 
	 
	 
}
