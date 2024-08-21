package com.print3dsoft.validator.validator;

import com.print3dsoft.validator.domain.StudentOrder;
import com.print3dsoft.validator.domain.AnswerWedding;

public class WeddingValidator {

    String hostName;
    String login;
    String password;

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("WeddingValidator is Running: "
                + hostName + ", " + login + ", " + password);
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }
}
