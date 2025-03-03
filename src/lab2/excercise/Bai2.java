package lab2.excercise;

import java.util.IllformedLocaleException;

public class Bai2 {
    double chieudai;
    double chieurong;
    public Bai2(double chieudai, double chieurong){
        if(chieudai<chieurong) {
            throw new IllformedLocaleException("ko phai la hình chu nhật");
        } else if(chieudai==chieurong){
            throw new IllformedLocaleException("la hinh vuong ko phai la hinh chu nhat");
        }
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }
    public void setChieudai(double chieudai){
        this.chieurong=chieudai;
    }
    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
public double DTHCN(){
        return chieurong*chieurong;
}
public double CVHCN(){
        return (chieurong+chieudai)*2;
}

@Override
    public String toString(){
        return "DTHCN: "+DTHCN()+
        "\n CVHCN: "+CVHCN()+
        "\n chieu dai: "+chieudai+
        "\n chieu rong: "+chieurong;
}
}

