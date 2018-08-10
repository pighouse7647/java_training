import java.util.function.Consumer;

/**
 * 
 */

/**
 * @author chenhaoxian
 *
 */

public class ProcessControlOne {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Object> log = System.out::println;	
		boolean a = 20>5;
		if(a) log.accept(a);
		
		
		

	}

}
