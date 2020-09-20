public class test {
    public static void main(String[] args)
    {   
        //*을 1개부터 10개까지출력하세요
        String str="*";
        for ( int i=1; i<11; i++)
            {
                for (int j=1; j<=i;j++)
                {
                    System.out.print(str);// 별을 i개출력
                }
                System.out.println();
            }
    }
}
