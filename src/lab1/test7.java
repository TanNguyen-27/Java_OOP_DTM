package lab1;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.print("nhap mon d ly: ");
        double ly= tc.nextDouble();
        System.out.print("nhap mon d hoa: ");
        double hoa= tc.nextDouble();
        System.out.print("nhap mon d sinh: ");
        double sinh= tc.nextDouble();
        System.out.print("nhap mon d toan: ");
        double toan= tc.nextDouble();
        System.out.print("nhap mon d may tinh: ");
        double maytinh=tc.nextDouble();
                bai7 s7=new bai7(ly,hoa,sinh,toan,maytinh);
                        s7.hienthi();

    }
}
