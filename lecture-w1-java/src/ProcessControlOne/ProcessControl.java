package ProcessControlOne;

public class ProcessControl {

	public static void main(String[] args) {
//		method1();
//		method2((int) (Math.random()*10), (int) (Math.random()*10));
		method3();
	}

	private static void method1() {
		int b = 10;
		int a = 11;
		if(a > b) {
			System.out.println(a + " > " + b);
		} else if(a < b){
			System.out.println(a + " < " + b);
		} else {
			System.out.println(a + " = " + b);
		}
	}
	private static void method2(int a, int b) {
		if(a > b) {
			System.out.println(a + " > " + b);
		} else if(a < b){
			System.out.println(a + " < " + b);
		} else {
			System.out.println(a + " = " + b);
		}
	}
	private static void method3() {
		int i = 0;
		while (i < 100) {
			System.out.printf("%3d: ", i + 1); // align at 3 digits
			method2((int) (Math.random()*10), (int) (Math.random()*10));
			i++;
		}
	}

}
