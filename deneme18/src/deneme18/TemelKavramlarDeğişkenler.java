package deneme18;

import java.util.Scanner;

public class TemelKavramlarDeğişkenler {

	public static void main(String[] args) {
		// değişkenleri oluştur
		int mat, fizik, kimya, turkce, tarih, muzık;

		// scanner sınıfını tanımla
		Scanner scan = new Scanner(System.in);
		// kullanıcıdan değerleri al
		System.out.print("Matematik Notunuzu Giriniz :");
		mat = scan.nextInt();
		System.out.print("fizik Notunuzu Giriniz : ");
		fizik = scan.nextInt();
		System.out.print("kimya Notunuzu Giriniz : ");
		kimya = scan.nextInt();
		System.out.print("turkce Notunuzu Giriniz : ");
		turkce = scan.nextInt();
		System.out.print("tarih Notunuzu Giriniz : ");
		tarih = scan.nextInt();
		System.out.print("muzık Notunuzu Giriniz : ");
		muzık = scan.nextInt();
		double toplam = (mat + fizik + kimya + turkce + tarih + muzık);
		double ortalama = toplam / 6;
		System.out.print("Ortalamanız: " + ortalama);
		boolean sonuc = ortalama >= 60;
		System.out.println(ortalama >= 60 ? "  Sınıfı Geçtiniz.." : " Sınıfta Kaldınız..");

	}

}