package lab1;

public class bai6 {
    double a;
    double b;
    double c;
    public bai6(double a, double b, double c){
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

    public double getC() {
        return c;
    }
    public void kttamgiac(){
        if((a>0&&b>0&&c>0)&&a+b>c&&a+c>b&&b+c>a){
            System.out.println("tam giac hop le");
        }
        else {
            System.out.println("tam gia ko hop le");
        }
    }
    public void hienthi(){
        System.out.println("canh a: "+a);
        System.out.println("canh b: "+b);
        System.out.println("canh c"+c);
        kttamgiac();
    }
}
