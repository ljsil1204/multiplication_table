package codes;

public class MainDrive {

	public static void main(String[] args) {
		
//		[응용문제 - 과제] 구구단 2~9단 출력
		
		for(int i=2; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				System.out.println(i +"x" + j + "=" + i*j);
			}
			
			System.out.println();
			
		}
		
	}
	
}
