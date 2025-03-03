package lab1;

public class bai9 {
int n;
public bai9(int n){
    this.n=n;
}

    public int getN() {
        return n;
    }
    public int tong(int n){
        n = Math.abs(n);
        int sum=0;
        while (n > 0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int tich(int n) {
        n = Math.abs(n);
        int nhan = 1;
        if (n == 0) return n;
        while (n > 0) {
            nhan *= n % 10;
            n /= 10;
        }
        return nhan;
    }
public void hienthi(){
    System.out.println("so da duoc nhap: "+n);
    System.out.println("tinh tong: "+tong(n));
    System.out.println("tinh tich: "+tich(n));
}
}


