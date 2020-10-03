import java.util.Scanner;

// 문제
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

// 출력
// 1부터 n까지 합을 출력한다.
public class problem8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); // 숫자입력

        int sum=0;

        //변수에 대한 범위 설정 (1<=i && i>=10000)
        for(int k=1;k<=i;k++){
        sum=sum+k;
        }
        
        System.out.println(sum);

        //for문 조건을 1부터 숫자까지 설정
        //각각의 수를 더하기
        //더해진 값을 출력하기


    }
}
