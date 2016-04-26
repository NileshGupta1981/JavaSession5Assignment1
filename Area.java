//import java.util.Scanner;

public class Area extends Shape {
	
	
	public static void main (String args[]) {
		Area area = new Area();
		double base=area.getbase();
		double height=area.getheight();
		double rectarea = ReactArea(base, height);
		double triarea = TriArea (base, height);
		System.out.println ("Area of Rectangle is: "+ rectarea);
		System.out.println ("Area of Triangle is: "+ triarea);
		
	}
	
	public static double ReactArea (double base , double height){
		double Area = base*height;
		return Area;
		
	}
	
	public static double TriArea (double base , double height){
		double Area = 0.5*
				base*height;
		return Area;
		
	}
}