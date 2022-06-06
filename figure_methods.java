import java.util.Scanner;

public class figure_methods {
    static int step1(int n){
        if(n<=0){
            return n;
        }
        else{
            System.out.print(n+",");
        }
        return step1(n-5);
    }
    static int step2 (int n,int a){
        if(n>a){
            return n;
        }
        else{
            System.out.print(n+",");
        }
        return step2(n+5, a);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Sayinizi giriniz : ");
        int sayi = input.nextInt();

        step2(step1(sayi),sayi);

    }
}
