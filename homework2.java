public class homework2 {

    public static void main(String[] args){

        // 1, 자기자신 제외한 수를 나눴을때 나머지가 0인게 없다.
       for (int i=2; i<1000; i++) // i값 설정(2<i<1000) 반복
      {  int j; // 변수 j값 요청
        for(j = 2; j<i; j++){ //반복문: 2부터 i까지 반복하도록
            if(i%j==0){ //조건문: i를 j로 나눈값이 0이라면
                break; // 탈출하고
            }
        }
            if(j==i){ // j의 값이 i와 같다면
                System.out.println(i); //
            }
        }
    }
}