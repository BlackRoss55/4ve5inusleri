import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y,z,d,i=1,j=1;
        System.out.print("Hangi sayıya kadar kuvvet alınsın: ");
        x = sc.nextInt();
        System.out.print("kuvveti alınacak 1. sayı: ");
        y= sc.nextInt();
        System.out.print("Kuvveti alınacak 2. sayı: ");
        z = sc.nextInt();
        while(i<=x){
            i*=y;
            if(i>=x){
                continue;
            }
            System.out.println("1. sayının girilen sayıya kadar olan kuvvetleri: "+i);
        }
        while(j<=x){
            j*=z;
            if(j>=x){
                continue;
            }
            System.out.println("2. sayının girilen sayıya kadar olan kuwetleri: "+j);
        }
    }
}