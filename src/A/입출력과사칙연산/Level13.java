package A.입출력과사칙연산;

/*
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
			472 - (1)
		X 385 - (2)
--------------------
		 2360 - (3)
		3776 - (4)
	 1416 - (5)
--------------------	 
   181720 - (6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*/

import java.util.*;
public class Level13 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sc1 = sc.nextInt();
    int sc2 = sc.nextInt();
    int a = sc2%10;
    int b = (sc2%100) - a;
    int c = (sc2%1000) - (a+b);
    System.out.println(sc1*a);
    System.out.println((sc1*b)/10);
    System.out.println((sc1*c)/100);
    System.out.println(sc1*sc2);
    sc.close();
  }
}
