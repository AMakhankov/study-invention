package com.print3dsoft.validator.validator;

import com.print3dsoft.validator.domain.StudentOrder;
import com.print3dsoft.validator.domain.AnswerChildren;

public class ChildrenValidator {

    String hostName;
    String login;
    String password;

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("ChildrenValidator is Running: "
                + hostName + ", " + login + ", " + password);
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
