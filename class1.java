public class class1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //반복문: 0시작, 9까지, 반복
            System.out.println("haha"); //haha라는 말을 출력하라
            if (i > 5) {
                System.out.println("if"); // i가 5보다 크다면 if라는 단어를 출력하라
            }
            else{
                System.out.println("else");  // i가 5보다 크지 않다면 else라는 단어를 출력하라
            }
            System.out.println(i); // i를 출력하라
        }
    }
}