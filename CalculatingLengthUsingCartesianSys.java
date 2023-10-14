import java.util.Scanner;

public class CalculatingLengthUsingCartesianSys{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cordinate value ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		calculateLength(x1, y1, x2, y2);
	}

	private static void calculateLength(double x1, double y1, double x2, double y2){
		double length=Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println("Length = "+ length);
	}
}
