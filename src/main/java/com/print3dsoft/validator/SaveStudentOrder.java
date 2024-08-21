package com.print3dsoft.validator;

import com.print3dsoft.validator.domain.Adult;
import com.print3dsoft.validator.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        buildStudentOrder();

//        StudentOrder so1 = new StudentOrder();
//        StudentOrder so2 = new StudentOrder();
//
//        long id1 = saveStudentOrder(so1);
//        long id2 = saveStudentOrder(so2);
//        System.out.println(id1 + id2);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long result;
        result = 199;
        System.out.println("saveStudentOrder: ");

        return result;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        husband.setSurName("Петров");
        husband.setPassportNumber("123456");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);

        return so;
    }
}
