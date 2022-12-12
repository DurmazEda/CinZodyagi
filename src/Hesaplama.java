import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz:");
        yil = input.nextInt();
        int hesap = yil%12;

        if (hesap == 0) {
            System.out.println("Çin zodyağı burcunuz : maymun");
        } else if (hesap == 1) {
            System.out.println("Çin zodyağı burcunuz : horoz");
        }else if (hesap == 2) {
            System.out.println("Çin zodyağı burcunuz : köpek");
        }else if (hesap == 3) {
            System.out.println("Çin zodyağı burcunuz : domuz");
        }else if (hesap == 4) {
            System.out.println("Çin zodyağı burcunuz : fare");
        }else if (hesap == 5) {
            System.out.println("Çin zodyağı burcunuz : öküz");
        }else if (hesap == 6) {
            System.out.println("Çin zodyağı burcunuz : kaplan");
        }else if (hesap == 7) {
            System.out.println("Çin zodyağı burcunuz : tavşan");
        }else if (hesap == 8) {
            System.out.println("Çin zodyağı burcunuz : ejderha");
        }else if (hesap == 9) {
            System.out.println("Çin zodyağı burcunuz : yılan");
        }else if (hesap == 10) {
            System.out.println("Çin zodyağı burcunuz : at");
        }else if (hesap == 11) {
            System.out.println("Çin zodyağı burcunuz : koyun");
        }
        else {
            System.out.println("Hatalı bilgi");
        }

    }

}
