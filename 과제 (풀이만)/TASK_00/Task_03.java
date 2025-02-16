// 실습 3. 숫자 맞추기
// 프로그램은 1~100까지의 임의의 수를 발생시킨다.
// 사용자는 1~100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
// 사용자가 값을 입력하면 컴퓨터는 앞에서 생성한 값과 비교해서 결과를 알려준다.
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
// 참고 : int answer = (int)(Math.random() *100 +1;
// 입력 : Scanner scan = new Scanner(System.in);

package TASK_00;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = (int)(Math.random()*100)+1;
        int num =0;

        for( ; ; ){
            System.out.print("1~100 사이의 수 입력 : ");
            int str = scan.nextInt();
            num++;
            if(str>answer){
                System.out.print("더 작습니다."+"\n");
                //continue;
            }
            else if(str<answer){
                System.out.print("더 큽니다."+"\n");
                //continue;
            }
            else if(str == answer){
                System.out.print("정답입니다. 총 횟수 : "+num+"회");
                break;
            }
        }
    }
}
