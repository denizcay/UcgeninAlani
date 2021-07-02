import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        int k1, k2, k3;
        Scanner imput = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz:");
        k1 = imput.nextInt();
        System.out.print("Üçgenin ikinci kenarını giriniz:");
        k2 = imput.nextInt();
        System.out.print("Üçgenin üçüncü kenarını giriniz:");
        k3= imput.nextInt();
        double u = (k1 + k2 + k3)/2.0;
        double alan = u*(u-k1)*(u-k2)*(u-k3);
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin alanı:" +alan);

    }
}
