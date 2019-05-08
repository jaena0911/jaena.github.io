package open;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("원의 반지름은? ");
		double n=scn.nextDouble();
		
		System.out.println("원의 넓이 : "+ n*n*3.14);
		
		scn.close();
	}

}
