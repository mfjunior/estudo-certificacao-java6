
public class MyArray {
	public static void arrange(int[] array) {
		int length= array.length;
		int half = length/2;
		
		while(half>=1) {
			for (int i = half; i < length; i++) {
				int temp = array[i];
				int test = i;
				
				while(test>=half && temp < array[test-half]) {
					array[test] = array[test-half];
					test-=half;
				}
				array[test]=temp;
			}
			half/=2;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,1223,34,43,8,87,1233,1,7};
		arrange(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
