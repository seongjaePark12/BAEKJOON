package A.입출력과사칙연산;
import java.util.*;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Level5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
		sc.close();
	}
}
