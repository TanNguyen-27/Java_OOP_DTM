package lab2.excercise;

public class Bai3 {
    int MASV;
    String Hoten;
    float DiemLT;
    float DiemTH;

    public Bai3(int MASV, String Hoten, float DiemLT, float DiemTH) {
        this.MASV = MASV;
        this.Hoten = Hoten;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }

    public Bai3() {
        Hoten = " ";
        MASV = 0;
        DiemLT = 0;
        DiemTH = 0;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public int getMASV() {
        return MASV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setDiemLT(float diemLT) {
        DiemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        DiemTH = diemTH;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public void setMASV(int MASV) {
        this.MASV = MASV;
    }

    public double DTB() {
        return (DiemTH + DiemLT) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f",MASV,Hoten, DiemTH, DiemLT, DTB());
    }
}
