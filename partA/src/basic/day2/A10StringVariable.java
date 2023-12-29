package basic.day2;

public class A10StringVariable {

    public static void main(String[] args) {
    
        //string은 문자열 : 문자의 집합
        String message = "안녕하세요";

        System.out.println(message);
        System.out.println("메세지 '"+ message + "'의 길이 : " + message.length());

        //String으로 선언된 변수는 객체이다
        //그래서 여러 메소드를 가지고 필요한 기능을 제공 ex) .lingth()

        message ="Welcome~ Java World!!!!";
        System.out.println("메세지 '"+ message + "'의 길이 : " + message.length());

        //char imo ='😊';  //char은 2바이트 이모지는 4바이트 이므로 문자열로 저장해야함
        String imo = "😊";
        System.out.println(imo);

        //자바 String의 주요 메소드 7가지씩 조사 후 테스트

        System.out.println("toLowerCase()는 알파벳 소문자로 변환한 새로운 문자열을 리턴 : "+message.toLowerCase());
        System.out.println("\nmessage.charAt()는 특정 위치의 문자를 리턴, 5번째 문자는 : "+message.charAt(5));
        System.out.println("\nmessage.indexOf()는 문자열 내에서 주어진 문자열의 위치를 리턴, Java의 위치 : "+message.indexOf("Java"));
        System.out.println("\nreplace(CharSequence target, CharSequence replacement)는 target 부분을 replacement로 대치한 새로운 문자열을 리턴, Java를 My로 대체 : "+message.replace("java","My"));
        System.out.println("\nsubstring(int beginIndex)는 beginIndex 위치에서 끝까지 잘라낸 새로운 문자열을 리턴, 10번째에서 잘라냄 : "+ message.substring(10));
        System.out.println("\nsubstring(int beginIndex, int endIndex)는 beginIndex 위치에서 endIndex 전까지 잘라낸 새로운 문자열을 리턴, 4번째에서 10번째까지 잘라내 리턴 :  "+message.substring(4,10));



    }

}
