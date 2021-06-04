package basic.dev;

import java.util.Scanner;

/**
 * Xây dựng class: AgeException bắt lỗi nếu tuổi nhập vào bé hơn 18
 * @param args
 */
public class MainApp {
	
	static void checkAge(int age) throws AgeException {
		if(age <= 0) throw new AgeException("chua sinh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		int age = Scan.nextInt();
		
		try {
			checkAge(age);
		} catch (AgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}		
}
