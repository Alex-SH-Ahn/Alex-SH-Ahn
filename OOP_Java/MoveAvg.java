import java.util.Scanner;

class MoveAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt(); //전체 프로그램 반복 개수

        while (tc-- > 0) {
            int n = sc.nextInt(); // 수열 데이터 개수
            
            int[] arr = new int[n]; //초기에 입력될 배열
            
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt(); // 수열 데이터 입력
                arr[j] = m;
            }
            
            int k = sc.nextInt(); //주기입력
            
            int[] fin = new int[n-k+1]; //최종배열
            
            
            for (int p = 0; p < (n-k+1); p++) {
                int sum = 0;
                for (int q = 0; q < k; q++) {
                    sum += arr[p+q];
                }
                fin[p] = sum/k;
            }

            System.out.print((n-k+1) + " ");

            for (int l = 0; l < (n-k+1); l++) {
                System.out.print(fin[l]+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
