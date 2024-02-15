import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int tc = sc.nextInt(); //전체를 몇 번 반복?

        while (tc-- > 0) {
            int num = sc.nextInt(); // 숫자를 입력받음
            //int newNum = num;
            int a;
            int b;
            int cnt = 0; //몇 번 반복?

            while ((num != 0) && (num != 6174)) {
                a = descending(num); //내림차순
                //System.out.println("numA: "+a);
                b = ascending(num); //오름차순
                //System.out.println("numB: "+b);

                num = a-b;
                //System.out.println("num: "+num);
                cnt++;
            }

            if ((num == 6174 | num == 0) & (cnt == 0)) System.out.printf("%d %d%n", 6174, 1);
            else if (num == 6174) System.out.printf("%d %d%n", 6174, cnt);
            else if (num == 0) System.out.printf("%d %d%n", 0, cnt);
        }
        sc.close();
    }

    static int descending(int num) { //내림차순
        String str = String.valueOf(num);
        
        char[] arrA = str.toCharArray();
        Arrays.sort(arrA);

        for (int i = 0; i < (arrA.length/2); i++) {
            char temp = arrA[i];
            arrA[i] = arrA[(arrA.length/2) - i + 1];
            arrA[(arrA.length/2) - i + 1] = temp;
        }
        
        String numA = new String(arrA);

        int a = Integer.valueOf(numA);
        return a;
    }

    static int ascending(int num) { // 오름차순
        String str = String.valueOf(num);
        
        char[] arrB = str.toCharArray();
        Arrays.sort(arrB);

        String numB = new String(arrB);

        int b = Integer.valueOf(numB);
        return b;
    }

}
