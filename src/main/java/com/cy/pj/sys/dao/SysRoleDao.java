package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.vo.SysRoleMenuVo;

@Mapper
public interface SysRoleDao {
	
	int updateObject(SysRole entity);
	/**
	 * 基于id查询角色以及角色对应的菜单id
	 * @param id
	 * @return
	 */
	SysRoleMenuVo findObjectById(Integer id);
	 
	  /**
	   * 保存角色自身信息
	   * @param entity
	   * @return
	   */
	
	  int insertObject(SysRole entity);
	  /**
	   * 基于角色id删除角色自身信息
	   * @param id
	   * @return
	   */
	  @Delete("delete from sys_roles where id=#{id}")
	  int deleteObject(Integer id);

	  /**
	   * 基于条件统计记录总数
	   * @param name
	   * @return
	   */
	  int getRowCount(String name);
	  /**
	   * 基于条件从指定位置查询当前页数据
	   * @param name 查询条件，角色名称
	   * @param start 起始位置
	   * @param pageSize 页面大小
	   * @return 当前页查询到的记录
	   */
	  List<SysRole> findPageObjects(String name,Integer startIndex,Integer pageSize);
	  
	  
	  
}







