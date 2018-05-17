package com.company;

/**
 * Created by agangwar on 2/1/18.
 */
public class A extends Test1 {


    public static void main(String[] args) {
        A a = new A();
        Test1 t = new A();

        String[] s={"q", "w"};
        t.test(s);
        System.out.println(t.i);
    }

   @Override
    public void test(String[] args) {
        System.out.println("I belong to  child" );
    }
}
