package lab1;

public class bai2 {
    double chieucao;
    double chieurong;
    public bai2(double chieudai,double chieurong){
        chieucao=chieudai;
        this.chieurong=chieurong;
    }
    public double getChieurong() {
        return chieurong;
    }
    public double getChieucao() {
        return chieucao;
    }
    public void getDTHCN() {
        if (chieucao > chieurong && chieurong > 0 && chieucao > 0) {
            System.out.println("dien tích là:" + chieucao * chieurong);
        } else if (chieucao == chieurong) {
            System.out.println("ko phai hinh chu nhat");
        } else {
            System.out.println("ko hop le!");
        }
    }
        public void hienthi(){
            System.out.println("chieu dai= "+ chieucao);
            System.out.println("chieu rong= "+ chieurong);
            getDTHCN();
        }
}




