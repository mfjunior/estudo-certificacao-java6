package simulado1;

public class Test {
	final Object obj;
	
	Test() {
		obj=null;
		System.out.println(obj instanceof Object);
		Integer i = new Integer("1");
		//obj=i;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.obj);
		int[] ai = new int[]{1,2,3};
		Object x=null;
	}
}
