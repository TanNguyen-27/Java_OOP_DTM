package lab1;

public class bai1 {
    String name;
    String MASV;
    int tuoi;
    String lop;
    String ngsinh;

    public bai1(String name, String MASV, int tuoi, String lop,String ngsinh) {
        this.name = name;
        this.MASV = MASV;
        this.tuoi = tuoi;
        this.lop = lop;
        this.ngsinh=ngsinh;
    }

    public String getName() {
        return name;
    }

    public String getMASV() {
        return MASV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }
    public String getNgsinh(){
        return ngsinh;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } else {
            System.out.println("khong hợp lệ! Nhập lại");
        }
    }

    public void hienthi() {
        System.out.println("MASS: " + MASV);
        System.out.println("Họ và Tên: " + name);
        System.out.println("lớp học: " + lop);
        System.out.println("tuổi: " + tuoi);
        System.out.println("ngày sinh: "+ngsinh);
    }
}

