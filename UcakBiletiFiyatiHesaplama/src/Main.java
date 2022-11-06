import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Uçak bileti fiyat hesaplama programına hoşgeldiniz :)");
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		int distance = scanner.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		int age = scanner.nextInt();
		
		System.out.print("Yolculuk tipini giriniz(1.Tek Yön , 2.Gidiş Dönüş): ");
		int type = scanner.nextInt();
		
		int totalPrice = 0;
		
		
		if(distance>0) {
			totalPrice += distance * 0.10;   //Km başına uygulanan ücret 0.10 TL olduğu için mesafeyle bu değeri çarptık
		}
		else {
			System.out.println("Hatalı km değeri girdiniz.");
			return;
		}
		
		
		
		
		if(age > 0) {
			if(age < 12) {
				totalPrice -= totalPrice * 50/100; // 12 yaşından küçüklere %50 indirim
			}
			else if(age >= 12 && age<= 24) {
				totalPrice -= totalPrice * 10/100; //12-24 yaş arasına %10 indirim 
			}
			else if(age >= 65) {
				totalPrice -= totalPrice * 30/100; //65 yaş üstüne %30 indirim
			}
		}else {
			System.out.println("Hatalı yaş değeri girdiniz.");
			return;
		}
		
		
		
		
		if(type == 1 || type == 2) {
			if(type == 2) {
				totalPrice -= totalPrice * 20/100; //Gidiş dönüş biletlere %20 indirim;
				totalPrice *= 2;					//Gidiş dönüş olduğu için 2 bilet fiyatı hesaplandı
			}
		}else {
			System.out.println("Hatalı yolculuk değeri girdiniz.");
			return;
		}
		
		System.out.println("Toplam tutar: " + totalPrice + " TL");
		
		
	}

}
