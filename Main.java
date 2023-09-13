import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int a,b,c;
        double alan, cevre, u;
        Scanner input=new Scanner(System.in);
        System.out.print("Üçgenin a kenarını giriniz: ");
        a=input.nextInt();
        System.out.print("Üçgenin b kenarını giriniz: ");
        b=input.nextInt();
        System.out.print("Üçgenin c kenarını giriniz: ");
        c=input.nextInt();
        u=(a+b+c)/2;
        cevre=2*u;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(cevre);
        System.out.println(alan);
    }
}
