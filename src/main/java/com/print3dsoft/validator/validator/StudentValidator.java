package com.print3dsoft.validator.validator;

import com.print3dsoft.validator.domain.StudentOrder;
import com.print3dsoft.validator.domain.AnswerStudent;

public class StudentValidator {

    String hostName;
    String login;
    String password;

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("StudentValidator is Running: "
                + hostName + ", " + login + ", " + password);
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }
}
