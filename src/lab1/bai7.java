package lab1;

public class bai7 {
    double ly;
    double hoa;
    double sinh;
    double toan;
    double maytinh;
    public bai7(double ly,double hoa,double sinh,double toan,double maytinh) {
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.toan = toan;
        this.maytinh = maytinh;
    }

    public double getLy() {
        return ly;
    }

    public double getHoa() {
        return hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public double getMaytinh() {
        return maytinh;
    }

    public double getToan() {
        return toan;
    }
    public double gettong() {
        return  (ly + hoa + sinh + toan + maytinh)/5;
    }
        public double tinhhang() {
            return (gettong()*100) / 10;
        }

    public String hang(){
        if(tinhhang()>90){
            return "hạng A";
        }
        else if(tinhhang()>80&&tinhhang()<90){
            return "hang B";
        }else if(tinhhang()>70&&tinhhang()<80){
            return "hang C";
        }
        else if(tinhhang()>60&&tinhhang()<70){
            return "hang D";
        }
        else if(tinhhang()>40&&tinhhang()<60){
            return "hang E";
        }
        else{
            return "hang F";
        }
    }

    public void hienthi(){
        System.out.println("nhap diem ly: "+ly);
        System.out.println("nhap diem hoa:"+hoa);
        System.out.println("nhap diem sinh: "+sinh);
        System.out.println("nhap diem toan: "+toan);
        System.out.println("nhap diem may tinh: "+maytinh);
        System.out.println(hang());
    }

}
