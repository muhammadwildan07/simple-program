import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowPic {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("SELAMAT DATANG");
        extracted();


    }

    private static void extracted() {
        System.out.println("""
                tentukan pilihan anda :
                \t 1. lanjutkan.\s
                \t 2. keluar\s
                """);
        int pilihan = scanner.nextInt();
        extracted(pilihan);
    }

    private static void extracted(int pilihan) {
        switch (pilihan) {
            case 1 -> {
                System.out.println("Masukkan nilai ganjil: ");
                int variable = getValidInput();
                print(variable);
            }
            case 2 -> {
                System.out.println("Good Bye");
                System.exit(1);
            }
//            TODO : make this code not causing exit
            default -> {
                System.out.println("Masukkan pilihan yang sesuai :");
                int pilihan1 = scanner.nextInt();
                extracted(pilihan1);
            }
        }
    }

    public static int getValidInput() {
        int val = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                val = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa bilangan bulat. Silakan coba lagi.");
                scanner.next(); // Menghapus buffer input yang tidak valid
            }
        }

        return val;
    }

    public static void print(int value) {
        if (value % 2 == 0) {
            System.out.println("Mohon masukkan nilai ganjil: ");
            int val = getValidInput();
            print(val);
        } else {
            System.out.println(" --- panjang --- ");
            for (int i = 1; i <= value; i++) {
                if (i == (value / 2) + 1) {
                    for (int j = 1; j <= value; j++) {
                        if (j - value == 0) {
                            System.out.println("* ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                } else {
                    for (int j = 1; j <= value; j++) {
                        if (j - value == (-value) + 1) {
                            System.out.print("* ");
                        } else if (j - value == 0) {
                            System.out.println("* ");
                        } else {
                            System.out.print("= ");
                        }
                    }
                }
            }
        }
        extracted();
    }
}
