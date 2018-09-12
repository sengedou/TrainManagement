package com.project.dao;
/**
 * 该DAO接口处理学员管理部分的学员基本信息持久层操作，负责定义数据库t_student表的增删改查操作的接口方法
 * @author 杨阳
 *
 */

import java.util.List;

import org.apache.ibatis.annotations.Update;

import com.project.bean.StudentBean;

public interface IStudentDao {
	/**
	 * 查找学生的基本信息
	 * @author 杨阳
	 * @param tId 参数为讲师的Id
	 * @return List<StudentBean>
	 *//*	
	public List<StudentBean> findStuByTeacherId(int tId);
	
	*//**
	 * 查找学生的基本信息
	 * @author 杨阳
	 * @param tId 参数为班主任的Id
	 * @return List<StudentBean>
	 *//*	
	public List<StudentBean> findStuByHeadTeacherId(int htId);
	*/
	/**
	 * 通过班级ID查找学生的详细信息
	 * @author 杨阳
	 * @param tId 参数为班主任的Id
	 * @return List<StudentBean>
	 */	
	public List<StudentBean> findStuByClassId(int classId);
	
	/**
	 * 通过姓名查找学生的详细信息
	 * @author 杨阳
	 * @param name 参数为学生的姓名
	 * @return StudentBean
	 */	
	public StudentBean findStuByName(String name);	
	
	/**
	 * 通过方向查找学生们的详细信息
	 * @author 杨阳
	 * @param tId 参数为班主任的Id
	 * @return List<StudentBean>
	 */	
	public List<StudentBean> findStuByDirection(String der);
	
	/**
	 * 通过学生编号更新学生的基本信息
	 * @author 杨阳
	 * @param 更新目标classId,更新参照stuId 
	 */
	@Update("update t_student set s_c_id=#{classId} where s_id=#{stuId}")
	public void updateClassIdByStuId(int classId,int stuId);
	
}
