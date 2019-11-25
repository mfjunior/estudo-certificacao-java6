package chapter5;

class Miner {
	static int x = 7;
	static String s;
	
	public static void getWeight(Mineral m) {
		int y = 0/x;
	}
	
	public static void main(String[] args) {
		Mineral[] ma = {new Mineral(), new Gem()};
		
		for(Object a: ma) {
			getWeight((Mineral) a);
			System.out.println(a.toString());
		}
	}	
}

class Mineral {
	@Override
	public String toString() {

		return this.getClass().toString();
	}
}

class Gem extends Mineral {}

