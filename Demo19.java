import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        int mouth = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("shuru");
        mouth = scanner.nextInt();
        scanner.close();

        if (mouth >= 3 && mouth <= 5) {
            System.out.println("春季");
        } else if (mouth >= 6 && mouth <= 9) {
            System.out.println("夏季");
        } else if (mouth >= 9 && mouth <= 11) {
            System.out.println("秋季");
        } else {
            System.out.println("冬季");
        }
    }
}
