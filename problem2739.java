import java.util.Scanner;

public class problem2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.close();
        for(int b=1;b<10;b++)

        System.out.printf("%d * %d = %d\n",a,b,a*b);}
}