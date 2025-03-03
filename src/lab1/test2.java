package lab1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        double chieucao= tc.nextDouble();
        System.out.println("nhap chieu rong:");
        double chieurong= tc.nextDouble();
        bai2 s2= new bai2(chieucao,chieurong);
        s2.hienthi();
    }
}
