import java.util.*;

public class Generics4 {
	public static void main(String[] args) {
		ArrayList<Circle> a= new ArrayList<Circle>();
		a.add(new Circle());
		ArrayList b = a;
		ArrayList<Rectangle> c = (ArrayList<Rectangle>)b;
		//ArrayList c = b;
		c.add(new Rectangle());
		for(Object o:b) {
			System.out.println(o);
		}
	}
}

class Shape{}

class Circle extends Shape{}

class Rectangle extends Shape{}
