import java.util.Scanner;

// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력
// 각 테스트 케이스마다 A+B를 출력한다.
public class problem10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // 해보려는 케이스의 수 입력

        for(int k=1; k<=tc; k++){

        int num1 = sc.nextInt();
        int num2 = sc.nextInt(); 
            
        int sum = num1 + num2;
        System.out.println(sum);
    
    }
        // 그 숫자만큼 반복하겠다는 걸 설정하고

        // 두 정수 입력 num1 num2

        // 두 정수의 합을 프린트 아웃
    }
}
