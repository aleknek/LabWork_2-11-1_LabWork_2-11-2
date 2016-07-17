package com.brainacad.oop.testexcp1;

public class MyTest {

    public void test() throws MyException{
        try {
            throw(new MyException("test3"));
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }
}
