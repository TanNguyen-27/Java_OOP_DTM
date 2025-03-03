package lab2.excercise;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        double chieudai = tc.nextDouble();
        System.out.print("nhap chieu rong:");
        double chieurong = tc.nextDouble();
        Bai2 s2 = new Bai2(chieudai, chieurong);
        System.out.println(s2.toString());
    }
}
