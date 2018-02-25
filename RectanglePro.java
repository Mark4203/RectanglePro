import java.util.Scanner;

public class RectanglePro {

	public static void main(String[] args) {
		int h;
		int w;
		Scanner banner;
		
		System.out.println("Please enter the height of a rectangle.");
		banner = new Scanner(System.in);
		h = banner.nextInt();
		
		System.out.println("Please enter a width of a rectangle.");
		w = banner.nextInt();
		
		int per = (h*2)+(w*2);
		System.out.println("The perimeter of the rectangle is "+ per+" units");
		banner.close();
		
		System.out.println("The area of the rectangle is "+w*h+" units");
		

	}

}