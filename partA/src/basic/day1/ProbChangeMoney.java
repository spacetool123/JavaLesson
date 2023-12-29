package basic.day1;

public class ProbChangeMoney {
    public static void main(String[] args) {

        int myWon=1000000;
        double toYen; //환전한 엔화 값

        int cost;   //여행경비
        int myYen;  //남은 여행 경비
        double toWon;  //남은 여행 경비 환전한 언화 값

        double yenTowonRate = 9.29; //1엔이 몇원? 살 때
        double wonToyenRate = 8.97; //1엔이 몇원? 팔 때


        cost = 98760;
        toYen = myWon/yenTowonRate;
        myYen = (int)toYen-cost;
        toWon = myYen*wonToyenRate;
        

        System.out.println("::: 한/일 23/12/28 기준 환율 :::");
        System.out.println("살 때 1엔 = "+yenTowonRate+"원");
        System.out.println("팔 때 1엔 = "+wonToyenRate+"원");

        System.out.println("");

        System.out.println("::: 원화를 엔화로 환전하기 :::");
        System.out.println("환전할 원화는 "+myWon+"원 입니다.");
        System.out.println("원화를 엔화로 바꿀 때 : "+toYen+"엔 입니다.");

        System.out.println("");

        System.out.println("::: 엔화를 원화로 환전하기 :::");
        System.out.println("일본에서 사용한 금액은 "+cost+"엔 입니다.");
        System.out.println("남은 엔화는 얼마인가요? "+myYen+"엔");
        System.out.println("엔화를 원화로 바꿀 때 : "+toWon+"원");
        
        System.out.println("");
    }
    
}
