package com.java1234.entity;


import javax.persistence.*;

/**
 * @program: jxc
 * @description: 角色实体
 * @author: Sean
 * @create: 2020-02-19 17:20
 **/
@Entity
@Table(name = "t_role")
public class Role {

    /**
     *  编号
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     *  角色名称
     */
    @Column(length = 50)
    private String name;

    /**
     *  备注
     */
    @Column(length = 1000)
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
