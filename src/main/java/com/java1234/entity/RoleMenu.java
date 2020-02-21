package com.java1234.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @program: jxc
 * @description: 角色菜单关联实体
 * @author: Sean
 * @create: 2020-02-19 17:20
 **/
@Entity
@Table(name="t_roleMenu")
public class RoleMenu {

	/**
	 *  编号
	 */
	@Id
	@GeneratedValue
	private Integer id;

	/**
	 *  角色
	 */
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role;

	/**
	 *  菜单
	 */
	@ManyToOne
	@JoinColumn(name="menuId")
	private Menu menu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
	
}
