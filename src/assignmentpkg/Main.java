package assignmentpkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun()); //Cannot make a static reference to the non-static method fun() from the type Main
	}
	
	int fun() {
		return 20;
		}

}

/*
 * Output:
 * Cannot make a static reference to the non-static method fun() from the type Main
 */

