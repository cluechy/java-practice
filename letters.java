public class letters {

    public static void main(final String[] args) 
    {   
            //*을 1개부터 10개까지출력하세요
            final String str="*"; // *에 대한 선언
            for ( int i=1; i<11; i++) // *에 대한 조건 설정( 스타트; 엔드; 계속실행)
                {
                    for (int j=1; j<=i;j++) // j에 대한 조건설정(스타드:1부터, 엔드:i까지, 계속실행)
                    {
                        System.out.print(str);// 별을 i개출력
                    }
                    System.out.println(); // 한 출력이 끝나면 엔터쳐라
                }
        }
}
    
    
    
    
    