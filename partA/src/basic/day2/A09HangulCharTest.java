package basic.day2;

public class A09HangulCharTest {

    public static void main(String[] args) {
        
        /*
         * 1.문자 '나' 부터 '낟' 까지 while문으로 출력
         * 2. 모두 몇개인지 구하기
         */

        char start = '나';
        char end = '낟';
        int codeNa = start;
        int codeNet = end;

		while (start<=end) {
			System.out.print(start+++" ");
			
		}
        System.out.println("\n현재 start값은 : "+start);

        System.out.println("\n총 개수는? "+(codeNet-codeNa+1));

    }

}
