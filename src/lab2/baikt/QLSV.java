package lab2.baikt;

public class QLSV {
    int MSSV;
    String hoten;
    String diachi;
    int sodt;
    public QLSV(String MSSV, String hoten, String diachi, String sodt){
        this.MSSV=MSSV;
        this.hoten=hoten;
        this.diachi=diachi;
        this.sodt=sodt;
    }
    public String getHoten(){
        return hoten;
    }

    public int getMSSV() {
        return MSSV;
    }

    public int getSodt() {
        return sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }
    public String toString(){
        return "ho va ten: "+hoten+
                "\n Ma so sinh vien: "+MSSV+
                "\n dia chi: "+diachi+
                "\n sodt: "+sodt;
    }
    @Override
    public int compareTo(QLSV sv) {
        return this.MSSV.compareTo(sv.MSSV);
    }
}
