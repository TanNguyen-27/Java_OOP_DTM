package lab1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner bb=new Scanner(System.in);
        System.out.print("nhap so dau vo: ");
        double a=bb.nextDouble();
        System.out.print("nhap so tiep theo vo: ");
        double b=bb.nextDouble();
        System.out.print("nhap so cuoi vo: ");
        double c=bb.nextDouble();
        bai5 s5=new bai5(a,b,c);
        s5.hienthi();
    }
}
