//     문제
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

// 출력
// 시험 성적을 출력한다.
public class Problem9488{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
                 {
                System.out.println("입력하세요. : "); // "입력하세요" 라는 말이 출력
                             
                int i = sc.nextInt();{ // 숫자입력

                    for(i=0; i<101; i++;){

                    if(i<100);{ // i가 90~100이면
                    break;
                    System.out.println("A");} // A를 출력하라

                    else if(i<90);{ // i가 80~89이면
                    break;
                    System.out.println("B");} // b를 출력하라
                    
                    else if(i<80);{ // i가 70~79이면
                    break;
                    System.out.println("C");} // c를 출력하라

                    else if(i<70);{ // i가 60~69이면
                    break;
                    System.out.println("D");} // d를 출력하라

                    else if(i<60);{ // i가 그 이하면
                    break;
                    System.out.println("F");} // F를 출력하라
                    }
                    
        }
    }
    }
}
