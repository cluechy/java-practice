import java.util.Scanner;

public class hwcf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("점수를 입력하세요"); // "점수를 입력하세요" 라는 말이 출력
            System.out.println("0.프로그램 종료"); // "0. 프로그램 종료" 라는 말이 출력
            System.out.println("1.점수입력"); // "1. 점수입력" 라는 말이 출력
            int num = sc.nextInt();
            if (num == 0)
                break;
            else if (num != 1)
                continue;

            String str = sc.next();  // 스트링을 받을때는 그냥 next
            String[] str2=str.split(","); // 입력한 변수를 , 기준으로 쪼갠다
            //int korean = sc.nextInt(); // 1-1. 국어에 대한 변수 설정 1-2.영어 1-3. 수학
            //int english = sc.nextInt();
            //int math = sc.nextInt();
            int korean = Integer.parseInt(str2[0]); // 배열로 분류된 걸 다시 숫자화시킴
            int english = Integer.parseInt(str2[1]);
            int math = Integer.parseInt(str2[2]);


            int sum = (korean+english+math); // 3. 각 수를 더한다 합을 만든다
            int average = (sum / 3); // 2. 각 수를 더해서 평균을 나눈다

            System.out.println("총 점수는" + sum + "입니다");
            System.out.println("평균은" + average + "입니다");

            // 1. 국어 영어 수학 점수를 입력받는다

            // 0을 입력하면 종료한다

        }
    }
}
