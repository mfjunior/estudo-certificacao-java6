package chapter6;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	String name;
	
	Dog(int w, String n) {
		weight = w;
		name=n;
	}
	
}
