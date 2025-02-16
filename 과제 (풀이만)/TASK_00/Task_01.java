// 실습 1. PASS/FAIL 판단
// 정수형 변수 score를 선언
// score 변수의 값이 50 이상이면 PASS, 50 미만이면 FAIL 출력
// 조건문 이용

package TASK_00;

public class Task_01 {
    public static void main(String[] args) {
        int score = 80;
        if(score >= 50) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
    }
}