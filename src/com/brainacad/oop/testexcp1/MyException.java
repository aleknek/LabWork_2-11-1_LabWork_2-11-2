package com.brainacad.oop.testexcp1;

public class MyException extends Exception {

    String myStr;

    public MyException(String myStr) {
        this.myStr = myStr;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "myStr='" + myStr + '\'' +
                '}';
    }
}
