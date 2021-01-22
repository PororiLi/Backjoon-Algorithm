import java.util.Scanner;
/*next(), nextInt(), nextLine()의 차이
next는 스페이스 전(공백)전까지 쓴 문자열을 리턴->스페이스: 함수 종료
nextInt, nextLine은 enter 전까지 쓴 문자열을 리턴-> 엔터 : 함수 종료
nextInt와 nextLine을 함께 쓸때에는 다음에 오는 함수가 엔터를 읽어 바로 종료되는 문제 발생.
사용후 엔터를 비워주는 것 필요(nextInt()후 한번 nextLine()을 사용하여 엔터 소모 후 입력값 스캔)
*/
public class Ab6 {
    public static void main(String[] args){
        int num;
        String ab;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.nextLine();//엔터비우기
        while(num != 0){
            ab = sc.next();
            String[] ab_s = ab.split(",");
            System.out.println(Integer.parseInt(ab_s[0])
                               + Integer.parseInt(ab_s[1]));
            num--;
        }
    }
}