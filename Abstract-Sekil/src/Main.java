
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("___________________________________________________________________");
            System.out.println("1 - kare alan hesapla");
            System.out.println("2 - dikdortgen alan hesapla");
            System.out.println("3 - ucgen alan hesapla");
            System.out.println("4 - daire alan hesapla");
            System.out.println("0 - exit");
            System.out.print("islem seciniz: ");
            int islem = input.nextInt();
            System.out.println();
            switch (islem) {

                case 0:
                    System.out.println("sistem kapatiliyor.");
                    return;
                case 1:
                    System.out.print("kare ismi giriniz: ");
                    String isim1 = input.next();
                    System.out.print("kenar: ");
                    int kenar = input.nextInt();
                    Sekil sekil1 = new Kare(isim1, kenar);
                    sekil1.alan_hesapla();
                    break;
                case 2:
                    System.out.print("dikdortgen ismi giriniz: ");
                    String isim2 = input.next();
                    System.out.print("en: ");
                    int en = input.nextInt();
                    System.out.print("boy: ");
                    int boy = input.nextInt();
                    Sekil sekil2 = new Dikdortgen(isim2, en, boy);
                    sekil2.alan_hesapla();
                    break;
                case 3:
                    System.out.print("ucgen ismi giriniz: ");
                    String isim3 = input.next();
                    System.out.print("dik kenar: ");
                    int dKenar = input.nextInt();
                    System.out.print("taban kenar: ");
                    int tKenar = input.nextInt();
                    Sekil sekil3 = new Ucgen(isim3, dKenar, tKenar);
                    sekil3.alan_hesapla();
                    break;
                case 4:
                    System.out.print("daire ismi giriniz: ");
                    String isim4 = input.next();
                    System.out.print("r: ");
                    int r = input.nextInt();
                    Sekil sekil4 = new Daire(isim4, r);
                    sekil4.alan_hesapla();
                    break;
                default:
                    System.out.println("dogru deger giriniz !!");
                    continue;

            }

        }

    }
}
