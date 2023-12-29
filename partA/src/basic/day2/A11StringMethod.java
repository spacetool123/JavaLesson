package basic.day2;

public class A11StringMethod {

    public static void main(String[] args) {
        //메소드는 메소드 이름 뒤에 괄호가 따라옴
        //괄호 안의 값들은 메소드 처리에 필요한 입력 데이터 > 메소드의 인자라고 부름
        //메소드가 처리한 결과는 출력 데이터 > 메소드의 리턴값이라 부름



        //메소드 인자의 개수와 형식에 따라 분류해보기
        String message = "Hello, World~";
        System.out.println(message);
        //1. 메소드 괄호 안에 아무것도 없는 것 
        System.out.println("toLowerCase()는 알파벳 소문자로 변환한 새로운 문자열을 리턴 : "+message.toLowerCase());


        //2. 메소드 괄호 안에 정수 1개를 쓰는 것 : charAt
        System.out.println("\nmessage.charAt()는 특정 위치의 문자를 리턴, 6번째 문자는 : "+message.charAt(5));

        //3. 메소드 괄호 안에 문자열 1개를 쓰는 것 : concat, equals, starsWidth, endsWidth
        System.out.println("\nmessage.indexOf()는 문자열 내에서 주어진 문자열의 위치를 리턴, W의 인덱스 번호 : "+message.indexOf("W"));

        //4. 메소드 괄호 안에 정수 2개를 쓰는 것 : substrings
        System.out.println("\nsubstring(int beginIndex, int endIndex)는 beginIndex 위치에서 endIndex 전까지 잘라낸 새로운 문자열을 리턴, 1번에서 3번까지 잘라내 리턴 :  "+message.substring(0,3));


        //5. 메소드 괄호 안에 문자 또는 문자열 2개를 쓰는 것 : replace
        System.out.println("\nreplace(CharSequence target, CharSequence replacement)는 target 부분을 replacement로 대치한 새로운 문자열을 리턴, World를 Java로 대체 : "+message.replace("World","Java"));


        //리턴값을 기준으로 정리하기
        // boolean : equals, contains, startsWith, endsWith
        // String : toUpperCase, toLowerCase,    
        // int : length, compareTo
        // char : charAt


    }
    
}
