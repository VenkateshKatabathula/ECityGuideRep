
package com.ecg.beans;

import java.io.Serializable;

public class LoginBean implements Serializable {

private int  userId;
private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
