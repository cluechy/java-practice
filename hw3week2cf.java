import java.util.Scanner;

public class hw3week2cf {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (true) {
            final int num = sc.nextInt();
            if (num == 0)
                break;
            // 1. 숫자를 문자로 변환한다
            final String str = Integer.toString(num);

            // 2. 변환한 숫자를 뒤집는 작업한다(+=,for사용)

            String str2 = "";
            for (int i = str.length() - 1; i >= 0; i--) // 뒤에서부터 하나씩 줄여라
            {
                str2 += str.charAt(i); // str를 뒤에서부터 하나씩 붙여라(복습!!)
            }
            if (str.compareTo(str2) == 0) { // 3. 두 숫자를 비교한다(compareTo사용) + 4. 두 숫자가 맞다면
                System.out.println("회문문입니다"); // 5. 프린트아웃("회문문입니다")
            } else {
                System.out.println("회문문이 아닙니다");
            }
        }
    }

    // +=
    // for
    // compareTo를 이용해서 정수를
    // Tostring

}