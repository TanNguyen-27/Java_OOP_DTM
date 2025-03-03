package lab1;

public class bai8 {
    int n;
    public bai8(int n){
        this.n=n;
    }
    public int getN(){
        return n;
    }
    public int Sodau(int n){
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public int Socuoi(int n){
        return Math.abs(n) % 10;
    }
    public void hienthi(){
        System.out.println("so da duoc nhap: "+n);
        System.out.println("so dau:" + Sodau(n));
        System.out.println("so cuoi: " + Socuoi(n));
    }
}
