import sun.tools.jstat.SymbolResolutionClosure;

public class hw3week2cf {public static void main(String[] args)
    
    { 
    //1-100까지의 숫자 중에서 8의 배수는 총 몇 개가 있는 지 개수를 구하시오 
    int n=0;
    int m=0;
    int cnt=0;
    int cmt=0; 
    
    while(true) 
    {
     n++; //8의 배수이면 cnt변수 1증가 
        if(n%8==0) 
            cnt++; //true문이기 때문에 break필수 
            if(n==100) 
                break; 
    }
    while(true)
    {
        m++;
            if(m%9==0)
             cmt++;
                if(m==100)
                break;
    }
    System.out.println("8의 배수 갯수: " + cnt + "개"); 
    System.out.println("9의 배수 갯수: " + cmt + "개");
    }

}
