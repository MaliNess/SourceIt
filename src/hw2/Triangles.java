package hw2;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double square, p, a, b, c;
		String temp="";
		Scanner in = new Scanner(System.in);
			System.out.println("Введите через пробел три стороны треугольника:");
			temp = in.nextLine();
				
			String[] split = temp.split(" ");
			a = Double.parseDouble(split[0]);
			b = Double.parseDouble(split[1]);
			c = Double.parseDouble(split[2]);
			
			if((a<(b+c)) && (b<(a+c)) && (c<(a+b))) {
				p = (a+b+c)/2;
				square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.println("Площадь треугольника равна квадратному корню из (p*(p-a)*(p-b)*(p-c)) = " + square);
			}
			else System.out.println("Треугольник с такими сторонами не существует!");
		in.close();
	}
}
