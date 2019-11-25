package chapter6;

public class Formatting {
	/*
	 * printf:
	 * 
	 * %[arg_index$][flags][width][.precision]conversion char
	 * 
	 * - arg_index : An integer followed directly by a $, this indicates which argument
	 * should be printed in this position
	 * 
	 * - flags: While many flags are available, for the exam you'll need to know:
	 * 		"-"  Left justify this argument
	 * 		"+"  Include a sign (+ or -) with this argument
	 * 		"0"  Pad this argument with zeroes
	 * 		","  Use locale-specific grouping separators(i,e., the comma in 123,456)
	 * 		"("	 Enclose negative numbers in parentheses
	 * 
	 * - width: This value indicates the minimum number of characters to print. 
	 * (If you want nice even columns, you'll use this value extensively).
	 * 
	 * - precision: For the exam you'll only need this when formatting a floating-point
	 * number, and in the case of floating point numbers, precision indicates the number of
	 * digits to print after the decimal point.
	 * 
	 * - conversion: The type of argument you'll be formatting. You'll need to know:
	 * 		b = boolean
	 * 		c = char
	 * 		d = integer
	 *  	f = floating point
	 *  	s = string
	 * 
	 */
	
	public static void main(String[] args) {
		//System.out.format("%b", 123);
		//System.out.format("%c","x");
		//System.out.printf());
		//System.out.printf("%d", 123);
		//System.out.printf("%f", 123);
		//System.out.printf("%d", 123.45);
		//System.out.printf("%f", 123.45);
		System.out.format("%s", 4132431);
		Object o = new Object();
		
	}	
}
