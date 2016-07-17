package com.brainacad.oop.testexcp1;

public class Main {

    public static void main(String[] args) throws MyException {

        try {
            throw(new MyException("test1"));
        }catch (MyException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("test2");
        }

        MyTest myTest = new MyTest();
        //MyTest myTest = null;
        myTest.test();

    }
}
