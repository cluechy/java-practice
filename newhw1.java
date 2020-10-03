import java.util.Scanner;

//     문제
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// 출력
// 시험 성적을 출력한다.
public class newhw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
            sc.close();
            if (i >= 90) { // i가 90~100이면
                System.out.println("A");
            } // A를 출력하라
            else if (i >= 80) { // i가 80~89이면
                System.out.println("B");
            } // b를 출력하라
            else if (i >= 70) { // i가 70~79이면
                System.out.println("C");
            } // c를 출력하라
            else if (i >= 60) { // i가 60~69이면
                System.out.println("D");
            } // d를 출력하라
            else { // i가 그 이하면
                System.out.println("F");
            } // F를 출력하라

    }
}
