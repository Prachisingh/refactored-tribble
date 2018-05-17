package com.company;

public class Test1 {
     public int i=10 ;
    int[] x= new  int[2147483647];
    int[][] p;
    int p1[][];
    int[] p2[];
    int []p3[];
    int [][]p4;
    int[] a,b;
    int[][] a1,b1;
    int[] []a2, b2;


    Test1()
    {
        System.out.println("inside base constructor ' ");
    }

    public static void main(String[] args) {
        int[] x= new  int[2147483647];
        int[][] i = new int[3][2];
        byte[] b = new byte[-3];
        boolean[] bo = new boolean[3];
	System.out.println("I  belong to parent ");
        System.out.println(bo.getClass().getName());
        System.out.println(args.length);
    }

    public void test(String[] args) {
        System.out.println("I \" belong to parent");
    }
}
