package com.maxwell.demo.entity;

import java.io.Serializable;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月14日 --  下午9:06 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class User implements Serializable {
    private static final long serialVersionUID = 2689464027026716208L;

    private String username;
    private Integer age;
    private String email;
    private String phone;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getUsername() + "---" + getAge() + "---" + getEmail() + "---" + getPhone();
    }
}
