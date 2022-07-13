package git;
import java.util.*;
public class grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] grade= {1,2,3,4};  
		
		System.out.println("학년을 입력하세요=>");
		int grad=sc.nextInt();
		System.out.println("점수를 입력하세요=>");  
		int score=sc.nextInt();
		
		if(score>=60) {
			
			if(grad !=4)
			System.out.println("합격!");
			else if(score >=70)
				System.out.println("합격");
			else
				System.out.println("불합격!");
		}
		else
			System.out.println("불합격!");
		
	}

}
