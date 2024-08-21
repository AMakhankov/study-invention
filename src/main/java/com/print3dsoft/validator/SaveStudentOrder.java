package com.print3dsoft.validator;

import com.print3dsoft.validator.domain.Adult;
import com.print3dsoft.validator.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {

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

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }
}
