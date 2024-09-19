import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner test= new Scanner(System.in);
        System.out.print("hay nhap mot so : ");
        double n=test.nextDouble();
        double sinValue=Math.sin(n);
        double cosValue=Math.cos(n);
        System.out.println("ket qua ham sin("+n+")="+sinValue);
        System.out.println("ket qua ham cos("+n+")="+cosValue);

    }
}