package open;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("���� ��������? ");
		double n=scn.nextDouble();
		
		System.out.println("���� ���� : "+ n*n*3.14);
		
		scn.close();
	}

}
