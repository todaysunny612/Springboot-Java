// 실습 4. 합게, 평균, 최고점수, 최저점수 - 배열
// 사용자로부터 학생 10명의 점수를 입력 받는다 (Scanner)
// 입력 받은 각 점수를 배열에 저장한다.
// 배열에 저장된 점수를 이용하여 아래의 값을 구하는 메소드를 구현.
// 학생 10명의 점수 합계를 구하는 메소드 - sum(int[])
// 평균을 구하는 메소드 - average(int[])
// 최고점수를 구하는 메소드 - max(int[])
// 최저점수를 구하는 메소드 - min(int[])
// 각 메소드는 연산결과를 반환한다. (리턴타입이 void 아님)

package TASK_00;

import java.util.Scanner;
import java.util.Arrays;

public class Task_04 {
public static int sum (int [] n){
    int sum =0;
    for(int k=0; k<10; k++){
        sum += n[k];
    }
    return sum;
}
public static int average(int [] n) {
    int average = sum(n)/10;
    return average;
}

public static int max(int [] n) {
    Arrays.sort(n);
    int max = n[9];
    return max;
}

public static int min(int [] n ) {
    Arrays.sort(n);
    int min = n[0];
    return min;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(sc.nextLine());
        }
        int total = sum(n);
        int Avg = average(n);
        int Max = max(n);
        int Min = min(n);

        System.out.println("합계 : " + total);
        System.out.println("평균 : " + Avg);
        System.out.println("최댓값 : " + Max);
        System.out.println("최솟값 : " + Min);
    }
}