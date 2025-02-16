// 실습 2. 3,6,9 게임
// 1~100 까지의 숫자를 출력하되 이 중 3,6,9 숫자가 포함되는 경우는 CLAP 출력.
// 한 줄에 10개의 숫자를 출력

package TASK_00;

public class Task_02 {
    public static void main(String[] args) {
        int [] arr = new int[101];
        for(int i=1; i<=100; i++){
            arr[i] = i;
        }
        for(int i=1; i<=100; i++){
            int num = arr[i];
            while(num>0) {
                int tmp = num % 10;
                if (tmp == 3 || tmp == 6 || tmp == 9) {
                    arr[i] = 0;
                    break;
                }
                num /= 10;
            }
        }
        for(int i=0; i<100; i+=10){
            for(int t=1; t<=10; t++) {
                if (arr[i + t] == 0) {
                    System.out.print("CLAP" + "\t");
                } else System.out.print(arr[i + t] + "\t\t");
            }
            System.out.println("\n");
        }
    }
}
