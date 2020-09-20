public class homework3week{

    public static void main(final String[] args) { // 8의 배수이거나 9의 배수이면 출력하다

        for (int i=2; i<101;i++){ //반복문(i는 2부터스타트 100아래 반복)
                   

            if (i%8==0) // 조건문(i를 8로 나눴을때 0인 값이라면)
            {
                System.out.println("----------------");
                System.out.println("8의 배수:"+i+"개");
            }
        }
        for (int j=2; j<101;j++)
            if(j%9==0) // 조건문(i를 9로 나눴을때 0인 값이라면)
            {
                System.out.println("9의 배수:"+j+"개");
            }
    
    }
}
