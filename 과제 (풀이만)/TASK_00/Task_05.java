// 실습 5. 배열에 저장된 값을 거꾸로 출력
// 배열에 저장된 각 원소를 순서를 거꾸로 출력
// 아래와 같은 시그니쳐(메소드 형태)를 가진 메소드를 구현 (파라미터, 리턴타입을 아래와 같은 형태로 구현)
// public void reverseArray(int[] intArray)
// 예) {10, 5, 26, 32} -> {32, 26, 5, 10}

package TASK_00;

import java.util.Arrays;
import java.util.Scanner;

public class Task_05 {
    public static void reverseArray(int[] Array){
        int min=0,  max = Array.length-1;
        while (min<max){
            int temp = Array[min];
            Array[min]=Array[max];
            Array[max]=temp;
            min++;
            max--;
        }
    }

    public static void main(String[] args) {
        System.out.println("reverse number : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int Array[] = new int[number];
        for (int i = 0; i < number; i++) {
            Array[i] = in.nextInt();
        }
        reverseArray(Array);
        System.out.println(Arrays.toString(Array));
    }
}
