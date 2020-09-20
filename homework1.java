public class homework1 {

    public static void main(String[] args){

        // 2의 배수이거나 5의 배수이면 출력하다
        for (int i=0;i<1000;i++){ //반복문(i는 0부터스타트 1000아래 엔드 반복)
            if (i%2==0||i%5==0){ // 조건문(i가 2로 나눴을때 0인 값이나 5로 나눴을때 0인 값이라면)
                System.out.println(i); //i를 출력하라
            }
        }


    }
}