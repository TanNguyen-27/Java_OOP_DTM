package lab1;

import java.util.Scanner;
    public class test8 {
        public static int tinhtong(int n){
        n=Math.abs(n);
            int sum =0;
            while (n >0){
                sum+=n%10;
                n/=10;
            }
            return sum;
        }
        public static int tinhtich(int n) {
            n = Math.abs(n); // Bỏ dấu âm nếu có
            int tich = 1;
            if (n == 0) return 0; // Nếu số là 0 thì tích là 0
            while (n > 0) {
                tich *= n% 10; // Nhân với chữ số cuối cùng
                n /= 10;           // Bỏ chữ số cuối
            }
            return tich;
        }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("nhap so vao: ");
        int n = tc.nextInt();
        System.out.println("tich= "+tinhtich(n));
        System.out.println("tong= "+tinhtong(n));
    }
}
