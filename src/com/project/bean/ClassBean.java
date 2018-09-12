﻿package com.project.bean;

import java.util.List;

/**
 * @author 杨阳
 * 班级表的bean对象
 * */
public class ClassBean {
	// 主键班级ID
	private int cId;
	// 班级名称
	private String className;
	// 班级阶段
	private StageBean stage;
	// 班级讲师
	private TeacherBean teacher;
	// 班主任
	private HeadTeacherBean headTeacher;
	// 学生
	private List<StudentBean> stulist;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public StageBean getStage() {
		return stage;
	}
	public void setStage(StageBean stage) {
		this.stage = stage;
	}
	public TeacherBean getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherBean teacher) {
		this.teacher = teacher;
	}
	public HeadTeacherBean getHeadTeacher() {
		return headTeacher;
	}
	public void setHeadTeacher(HeadTeacherBean headTeacher) {
		this.headTeacher = headTeacher;
	}
	public List<StudentBean> getStulist() {
		return stulist;
	}
	public void setStulist(List<StudentBean> stulist) {
		this.stulist = stulist;
>>>>>>> 3acf3ab8b20ab004a09046ff2235a01add581b7e
	}
	
}
