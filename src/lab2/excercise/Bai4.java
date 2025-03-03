package lab2.excercise;

public class Bai4 {
    String Ten;
    String Loai;
    double dungtich;
    double gia;

    public Bai4(String Ten, String Loai,double dungtich,double gia){
        this.dungtich=dungtich;
        this.Ten=Ten;
        this.Loai=Loai;
        this.gia=gia;
    }
    public Bai4(){
        Ten=" ";
        Loai=" ";
        dungtich=0;
        gia=0;

    }

    public double getGia() {
        return gia;
    }

    public double getDungtich() {
        return dungtich;
    }

    public String getLoai() {
        return Loai;
    }

    public String getTen() {
        return Ten;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public double thue() {
        if (dungtich < 100) {
            return gia * 0.01;
        } else if (dungtich >= 100 && dungtich <= 200) {
            return gia * 0.03;
        } else {
            return gia * 0.05;
        }
    }
    @Override
    public String toString(){
        return String.format("%-20s %-15s %20.0f %20.0f %20.0f",Ten,Loai,dungtich,gia,thue());
    }
}

