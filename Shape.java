import java.util.Scanner;

public class Shape{
	Scanner scnr = new Scanner(System.in);
	double base;
	double height;
public double getbase(){
	System.out.println ("Enter the lenght of base");
	base = scnr.nextDouble(); 
	return base;
	
}
	
public double getheight(){
	System.out.println ("Enter the lenght of height");
	height = scnr.nextDouble(); 
	return height;
}


}