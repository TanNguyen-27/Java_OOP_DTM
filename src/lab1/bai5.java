package lab1;

public class bai5 {
double a;
double b;
double c;
public bai5(double a, double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;
}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void GTnhonhat(){
    double min= Math.min(a, Math.min(b,c));
    System.out.println("gia tri nho nhat: "+min);
    }
    public void hienthi(){
    System.out.println("nhap gia tri dau tien: "+a);
    System.out.println("nhap gia tri thu tiep theo:"+ b);
    System.out.println("nhap gia tro cuoi cung: "+c);
    GTnhonhat();
    }
}
