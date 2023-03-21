import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner kong = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        matematik = kong.nextInt();

        System.out.print("Fizik Notu : ");
        fizik = kong.nextInt();

        System.out.print("Kimya Notu : ");
        kimya = kong.nextInt();

        System.out.print("Türkçe Notu : ");
        turkce = kong.nextInt();

        System.out.print("Tarih Notu : ");
        tarih = kong.nextInt();

        System.out.print("Müzik Notu : ");
        muzik = kong.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println(sonuc> 60.0 ? "Sınıfı Geçti": "Sınıfta Kaldı");
        }

    }

