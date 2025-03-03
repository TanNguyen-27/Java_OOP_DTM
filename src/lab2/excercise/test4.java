package lab2.excercise;

import java.util.Scanner;

public class test4 {
public static void main(String[]args){
    Scanner dc=new Scanner(System.in);
    Bai4 xe1=new Bai4();
    System.out.println("ten chu xe: ");
    xe1.setTen(dc.nextLine());
    System.out.println("loai xe: ");
    xe1.setLoai(dc.nextLine());
    System.out.println("dung tich: ");
    xe1.setDungtich(dc.nextDouble());
    System.out.println("tri gia: ");
    xe1.setGia(dc.nextDouble());
    dc.nextLine();
    Bai4 xe2=new Bai4();
    System.out.println("ten chu xe: ");
    xe2.setTen(dc.nextLine());
    System.out.println("loai xe: ");
    xe2.setLoai(dc.nextLine());
    System.out.println("dung tich: ");
    xe2.setDungtich(dc.nextDouble());
    System.out.println("tri gia: ");
    xe2.setGia(dc.nextDouble());
    dc.nextLine();
    Bai4 xe3=new Bai4();
    System.out.println("ten chu xe: ");
    xe3.setTen(dc.nextLine());
    System.out.println("loai xe: ");
    xe3.setLoai(dc.nextLine());
    System.out.println("dung tich: ");
    xe3.setDungtich(dc.nextDouble());
    System.out.println("tri gia:");
    xe3.setGia(dc.nextDouble());
    dc.nextLine();
    System.out.println("\nTen chu xe          loaixe                          dungtich            trigia       thuephainop");
    System.out.println("=====================================================================================================");
    Bai4[] cacloaixe={xe1,xe2,xe3};
    for(Bai4 xe: cacloaixe){
        System.out.println(xe);
    }
}
}
