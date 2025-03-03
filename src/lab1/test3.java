package lab1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner dc=new Scanner(System.in);
        System.out.println("nhap oF vo: ");
        double oF=dc.nextDouble();
        bai3 s3=new bai3 (oF);
        s3.hienthi();
    }
}
