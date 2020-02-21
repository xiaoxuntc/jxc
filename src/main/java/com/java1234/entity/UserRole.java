package com.java1234.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @program: jxc
 * @description: 用户角色关联实体
 * @author: Sean
 * @create: 2020-02-19 17:20
 **/
@Entity
@Table(name = "t_userRole")
public class UserRole {

    /**
     *  编号
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     *  用户
     */
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    /**
     *  角色
     */
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
