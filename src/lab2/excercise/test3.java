package lab2.excercise;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
    Bai3 sv1 = new Bai3(133, "Chung Tan Phat", 8.0f, 7.0f);
    Bai3 sv2 = new Bai3(116, "Trần Tuấn Minh", 9.0f, 9.5f);
    Bai3 sv3=new Bai3();
        System.out.println("nhap ma sinh vien: ");
        sv3.setMASV(tc.nextInt());
        tc.nextLine();
        System.out.println("nhap ho va ten: ");
        sv3.setHoten(tc.nextLine());
        System.out.println(" diem Lí thuyet: ");
        sv3.setDiemLT(tc.nextFloat());
        System.out.println(" diem Thuc hanh: ");
        sv3.setDiemTH(tc.nextFloat());
        System.out.println("\nmasv         hoten                   diemlt     diemth     diemtb");
        Bai3[] danhsach={sv1,sv2,sv3};
        for(Bai3 sv : danhsach)
            System.out.println(sv);
        }
}

