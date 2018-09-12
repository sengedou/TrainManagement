package com.project.dao;

import org.apache.ibatis.annotations.Update;

/**
 * 该DAO接口处理学员管理部分的学员基本信息持久层操作，负责定义数据库t_class表的增删改查操作的接口方法
 * @author 杨阳
 *
 */
public interface IClassDao {
	/**
	 * 更新班级的阶段信息
	 * @param pId 外键c_p_id,阶段表的p_id列
	 * @param cId 班级表的主键列c_id
	 * @return 详细学生信息对象
	 */
	@Update("update t_class set c_p_id=#{pId} where c_id=#{cId}")
	public void updatePeriodByClassId(int pId,int cId);
}
