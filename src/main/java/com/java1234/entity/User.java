package com.java1234.entity;

import javax.persistence.*;

/**
 * @program: jxc
 * @description: 用户实体
 * @author: Sean
 * @create: 2020-02-19 17:20
 **/
@Entity
@Table(name = "t_user")
public class User {

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 用户名
     */
    @Column(length = 50)
    private String userName;

    /**
     * 密码
     */
    @Column(length = 50)
    private String password;

    /**
     * 真实姓名
     */
    @Column(length = 50)
    private String trueName;

    /**
     * 备注
     */
    @Column(length = 1000)
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
