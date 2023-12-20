import java.util.Scanner;

public class ShowPic {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukan nilai ganjil: ");
        int val = scanner.nextInt();

        print(val);

    }

    public static void print(int value) {
        if (value % 2 == 0) {
            System.out.println("Mohon masukan nilai ganjil: ");
            int val = scanner.nextInt();
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
    }
}
