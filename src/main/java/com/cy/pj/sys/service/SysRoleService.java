package com.cy.pj.sys.service;

import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.vo.SysRoleMenuVo;

public interface SysRoleService {
	
	SysRoleMenuVo findObjectById(Integer id);
	/**
	 * 保存角色自身信息以及角色和菜单的关系数据
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int updateObject(SysRole entity,Integer[]menuIds);
	
	/**
	 * 保存角色自身信息以及角色和菜单的关系数据
	 * @param entity
	 * @param menuIds
	 * @return
	 */
	int saveObject(SysRole entity,Integer[]menuIds);
	
	 /**
	  * 基于角色id删除角色信息以及对应的关系数据
	  * @param id
	  * @return
	  */
	 int deleteObject(Integer id);

	 PageObject<SysRole> findPageObjects(String name,Integer pageCurrent);
}
