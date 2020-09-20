public class test2 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // i에 대한 조건 설정(i는 1부터 시작,10보다 작다, 더한다)
            for (int j = 1; j <= i; j++) { //j에 대한 조건 설정(j는 1부터 i까지 더한다)
                int value = i * j; //value에 대한 선언(value는 i*j이다)
                System.out.println(i + "*" + j + "=" + value); // 출력하라 (i의 숫자값(붙이기)*문자(j의숫자값)=문자,value의값)
            }
            System.out.println("--------------"); // 줄글을 출력하라
        }
    }
}
