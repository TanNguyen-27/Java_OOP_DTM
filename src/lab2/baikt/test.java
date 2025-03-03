package lab2.baikt;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        int a;
        Scanner tc=new Scanner(System.in);
        System.out.println("nhap so luong sinh vien đang có:");
        a = tc.nextInt();
        QLSV[] danhsach=new QLSV[a];
        for (int i=0; i<a; i++){
            System.out.println("nhap thong tin sinh vien: "+(i+1)+": ");
            System.out.print("MSSV: ");
            String MSSV = tc.nextLine();
            System.out.print("Họ tên: ");
            String hoten = tc.nextLine();
            System.out.print("Địa chỉ: ");
            String diachi = tc.nextLine();
            System.out.print("Số điện thoại: ");
            String sodt= tc.nextLine();
            danhsach[i] = new QLSV(MSSV, hoten, diachi, sodt);
        }
        Arrays.sort(QLSV);
        System.out.println("cac mang sap xep tang dan: "+Arrays.toString(QLSV));

        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (QLSV sv : danhsach) {
            System.out.println(sv);
        }
    }
}
