package lab1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner bb=new Scanner(System.in);
        System.out.println("nhap nam vo: ");
        double nam=bb.nextDouble();
        bai4 s4=new bai4(nam);
        s4.hienthi();
    }
}

