import java.util.Scanner;

public class KDVHesaplama {

    public static void main(String[] args) {
        // Kullanıcıdan tutarı girmesini istemek için Scanner sınıfını kullanıyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tutarı alıyoruz
        System.out.print("Tutarı giriniz (TL): ");
        double tutar = scanner.nextDouble();

        // KDV oranını ve KDV tutarını hesaplamak için değişkenler
        double kdvOrani;
        double kdvTutari;

        // KDV oranını belirleme
        if (tutar <= 1000) {
            kdvOrani = 0.18; // %18 KDV oranı
        } else {
            kdvOrani = 0.08; // %8 KDV oranı
        }

        // KDV tutarını hesaplama
        kdvTutari = tutar * kdvOrani;

        // Sonuçları ekrana yazdırmaAS
        System.out.printf("Tutar: %.2f TL%n", tutar);
        System.out.printf("KDV Oranı: %.0f%%%n", kdvOrani * 100);
        System.out.printf("KDV Tutarı: %.2f TL%n", kdvTutari);

        // Kaynakları kapama
        scanner.close();
    }
}


