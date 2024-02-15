import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        while (times-- > 0) {
            int n = sc.nextInt();
            int currentNumber = 1;
            for (int i = 1; i <= n; i++) {
                int num = currentNumber;
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d ", num);
                    num += n - j;
                }
                currentNumber += 1;
                System.out.println();
            }
        }
        sc.close();
    }    
}
