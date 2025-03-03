package lab1;

public class bai4 {
    double nam;
    public bai4(double nam){
        this.nam=nam;
    }
    public double getNam() {
        return nam;
    }
    public String tinhnam(){
if(nam < 0){
 return "ko hop le";
}
        else if((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
            return "la nam nhuan";
        } else{
                return "ko phai nam nhuan";
            }
        }
    public void hienthi(){
        System.out.println("nam= "+nam);
        System.out.println(tinhnam());
    }
}
