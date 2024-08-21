package com.print3dsoft.validator.validator;

import com.print3dsoft.validator.domain.StudentOrder;
import com.print3dsoft.validator.domain.AnswerCityRegister;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    String password;

    /*public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }*/

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is Running: "
                + hostName + ", " + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
