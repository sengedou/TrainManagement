package com.project.dao;

import com.project.bean.StudentInfoBean;

/**
 * 该DAO接口处理学员管理部分的学员详细信息的持久层操作，负责定义数据库t_studentinfo表的增删改查操作的接口方法
 * @author 杨阳
 *
 */
public interface IStudentInfoDao {
	/**
	 * 查找学生的详细信息
	 * @param stuId 外键学生表的s_id列
	 * @return 详细学生信息对象
	 */
	public StudentInfoBean findStuInfoById(int stuId);
}
