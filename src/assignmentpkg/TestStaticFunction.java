package assignmentpkg;

public class TestStaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());
	}

	
	static int fun() {
		static int x= 0; //Illegal modifier for parameter x; only final is permitted
		return ++x;
		}
}

/*
 * Output: Invalid modifier for variable x
 */

