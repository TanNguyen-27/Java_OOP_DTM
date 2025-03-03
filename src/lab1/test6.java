package lab1;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner bb=new Scanner(System.in);
        System.out.print("nhap so a: ");
        double a=bb.nextDouble();
        System.out.print("nhap so b: ");
        double b=bb.nextDouble();
        System.out.print("nhap so c: ");
        double c=bb.nextDouble();
        bai6 s6=new bai6(a,b,c);
        s6.hienthi();
    }
}
