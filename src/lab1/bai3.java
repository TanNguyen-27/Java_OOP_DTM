package lab1;

public class bai3 {
    double oF;

    public bai3(double oF){
        this.oF=oF;

    }


    public double getoF() {
        return oF;
    }
    public void getoC(){
            System.out.println("tính oC= (oF - 32) / 1,8= "+(oF-32)/1.8);
    }
    public void hienthi(){
        System.out.println("nhap oF: ");
        getoC();
    }
}
