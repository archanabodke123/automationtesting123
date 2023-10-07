package assignmentpkg;

class Car1{
	public void method1(){
		System.out.println("Car-method1");
	}
}
class Maruti1 extends Car1{
	public void method1(){
		System.out.println("Maruti-method1");
	}
}

class RuntimePoly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Maruti1();
		c1.method1();
		Maruti1 c2 = new Car1();  //Type mismatch: cannot convert from Car1 to Maruti1
		c2.method1();
	}

}

/*
 *Output: Type mismatch: cannot convert from Car1 to Maruti1 
 */

