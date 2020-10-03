import java.util.Scanner;


public class problem2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine(); // 숫자입력
        int num1=Integer.parseInt(temp);
        String num2 = sc.nextLine();


        int[] arr = new int[3];
        //num2에 대한 배열 선언 정리 필요

        int hun = (num2.charAt(0)-'0');
        int ten = (num2.charAt(1)-'0');
        int one = (num2.charAt(2)-'0');// num2를 배열로 3개로 쪼개고 각각 배열에 숫자 부여

        System.out.println(num1*one);
        System.out.println(num1*ten);
        System.out.println(num1*hun);

        System.out.println(num1*Integer.parseInt(num2));
    }
}