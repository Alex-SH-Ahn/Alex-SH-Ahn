import java.util.Scanner;
import java.util.Arrays;

class LifeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0){
            int SIZE = sc.nextInt(); //셀 사이즈
            int times = sc.nextInt(); // 라이프게임 반복 횟수
            int size = SIZE;

            int[] cells = new int[SIZE];
            int[] finCells = new int[SIZE];

            for (int i = 0; i < SIZE; i++) {
                cells[i] = sc.nextInt(); // 배열에 박테리아 넣기
            }
            
            for (int k = 0; k < SIZE; k++) {
                finCells[k] = cells[k]; // cells배열을 fincells에 할당
            }

            while (times-- > 0) {
                for (int j = 0; j < SIZE; j++) {
                    if (j == 0) { // 1. 맨 왼쪽 셀 계산
                        if (cells[j+1] < 3) {
                            if (cells[j] != 0) finCells[j]--; // 중간 셀이 0이 아닐때만 -1
                        } else if (cells[j+1] > 7) {
                            if (cells[j] != 0) finCells[j]--;
                        } else if (4 <= cells[j+1] && cells[j+1] <= 7) {
                            if (cells[j] < 9) finCells[j]++;
                        }
                    } else if (j != 0 && j != (size - 1)) { // 2. 중간 셀들 계산
                        if ((cells[j-1] + cells[j+1]) < 3) {
                            if (cells[j] != 0) finCells[j]--; // 중간 셀이 0이 아닐때만 -1
                        } else if ((cells[j-1] + cells[j+1]) > 7) {
                            if (cells[j] != 0) finCells[j]--;
                        } else if (4 <= (cells[j-1] + cells[j+1]) & (cells[j-1] + cells[j+1]) <= 7) {
                            if (cells[j] < 9) finCells[j]++;
                        }
                    } else if (j == (size - 1)) { //2. 맨 오른쪽 셀 계산
                        if (cells[j-1] < 3) {
                            if (cells[j] != 0) finCells[j]--; // 중간 셀이 0이 아닐때만 -1
                        } else if (cells[j-1] > 7) {
                            if (cells[j] != 0) finCells[j]--;
                        } else if (4 <= cells[j-1] && cells[j-1] <= 7) {
                            if (cells[j] < 9) finCells[j]++;
                        }
                    }
                }

                for (int k = 0; k < SIZE; k++) {
                    cells[k] = finCells[k]; //새로 바뀐 배열을 cells에 할당
                }

            }
            
            for (int n = 0; n < SIZE; n++) {
                System.out.print(finCells[n]+" ");
            }
            
            System.out.println();

        }
        sc.close();
    }
}
