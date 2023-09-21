import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdv = 0.18, fiyat,kdvOran,kdvliFiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Giriniz: ");
        fiyat = input.nextDouble();

        kdvOran = fiyat * kdv;
        kdvliFiyat = fiyat + kdvOran;

        System.out.println("Kdvsiz Fiyatı: " + fiyat);
        System.out.println("Kdv: " + kdv);
        System.out.println("Kdv Değeri: " + kdvOran);
        System.out.println("Kdvli Fiyatı: " + kdvliFiyat);


    }
}