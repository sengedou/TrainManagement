package com.project.bean;

import java.util.Date;

public class LeaveBean {
	private int id;	//id
	private int sid; // ���ѧԱid
	private int empid; // ��׼��id
	private Date sdate; // ��ٿ�ʼʱ��
	private Date edate; // ��ٽ���ʱ��
	private String reason;// �������
	private String comment; // ��ע
	private String photo; //����
	private StudentBean stuBean; //һ����ټ�¼��Ӧһ��ѧ��
	private TeacherBean teaBean; //һ����ټ�¼��Ӧһ����ʦ
	@Override
	public String toString() {
		return "LeaveBean [id=" + id + ", sid=" + sid + ", empid=" + empid
				+ ", sdate=" + sdate + ", edate=" + edate + ", reason="
				+ reason + ", comment=" + comment + ", photo=" + photo
				+ ", stuBean=" + stuBean + ", teaBean=" + teaBean + "]";
	}
	public LeaveBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveBean(int id, int sid, int empid, Date sdate, Date edate,
			String reason, String comment, String photo, StudentBean stuBean,
			TeacherBean teaBean) {
		super();
		this.id = id;
		this.sid = sid;
		this.empid = empid;
		this.sdate = sdate;
		this.edate = edate;
		this.reason = reason;
		this.comment = comment;
		this.photo = photo;
		this.stuBean = stuBean;
		this.teaBean = teaBean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public StudentBean getStuBean() {
		return stuBean;
	}
	public void setStuBean(StudentBean stuBean) {
		this.stuBean = stuBean;
	}
	public TeacherBean getTeaBean() {
		return teaBean;
	}
	public void setTeaBean(TeacherBean teaBean) {
		this.teaBean = teaBean;
	}
	
	
	
}
