import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shapes");
		System.out.println("Enter 1 to Calculate Perimeter Of A Square");
		System.out.println("Enter 2 to Calculate Perimeter Of A Rectangle");
		System.out.println("Enter 3 to Calculate Perimeter Of A Circle");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the length of the square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverloading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the length of the rectangle: ");
				int lengthOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				
				MethodOverloading.shape(lengthOfRectangle,breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.print("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverloading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid Input");	
		}		
	}
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeterOfSquare is %d%n", perimeterOfSquare);
	}

	public static void shape(int length, int breadth) {
		int perimeterOfRectangle = 2*(length + breadth);
		
		System.out.printf("The perimeter Of Rectangle is %d%n", perimeterOfRectangle);
	}
	
	
	public static void shape(double radius) {
		double perimeterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The perimeter Of Circle is %f%n", perimeterOfCircle);
	}
}			
	
		
		