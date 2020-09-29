import java.util.Scanner;

public class hw4week1 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("입력하세요. : "); // "입력하세요" 라는 말이 출력
                             
                int num = sc.nextInt();{ // 숫자입력
                
                int i; // 변수설정
                for(i=2; i<num; ++i){
                if (num%i == 0){
                    System.out.println("소수가 아닙니다");
                    break;}
                }
                if(num==i)
                System.out.println("소수입니다!");
                continue;
            }
            }
        }
    }
    