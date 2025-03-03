package lab2.excercise;
import java.util.Arrays;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[]agrs){
            Scanner tc= new Scanner(System.in);
            /// cau a)
            System.out.print("nhap so phan tu cua mang: ");
            int n= tc.nextInt();
            int[]arr= new int[n];
            System.out.println("nhap cac phan tu cua mang");
            for (int i=0; i<n; i++){
                System.out.print(" phan tu "+(i+1)+" có: ");
                arr[i]= tc.nextInt();
            }
            /// cau b)
        System.out.println("mang da duoc nhap: "+ Arrays.toString(arr));
            /// cau c)
        System.out.print("nhap co a can tim: ");
            int a= tc.nextInt();
            int timvitri= vitri(arr,a);
            if(timvitri!= -1){
                System.out.println("So "+a+" da duoc tim thay o vi tri thu: "+timvitri);
            }else {
                System.out.println("So "+a+" ko co o trong mang.");
            }
            /// cau d)
        int max=intMax(arr);
            System.out.println("gia tro lon nhat trong mang la: "+max);
            ///  cau e)
        int min=intMin(arr);
            System.out.println("gia tri nho nhat trong mang la: "+min);
            /// cau f)
        int Maxgiatri=vitri(arr, max);
            System.out.println("gia tri lon nhat cua mang: "+max+" va nam o vi tri thu: "+Maxgiatri);
            /// cau g)
        Arrays.sort(arr);
            System.out.println("cac mang sap xep tang dan: "+Arrays.toString(arr));

    }
    public static int vitri(int[] arr,int a){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static int intMax(int[] arr){
            int max=arr[0];
            for(int n:arr){
                if(n>max){
                    max=n;
                }
            }
            return max;
    }
    public static int intMin(int[] arr){
        int min=arr[0];
        for(int n:arr){
            if(n<min){
                min=n;
            }
        }
        return min;
    }
}
