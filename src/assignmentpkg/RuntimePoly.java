package assignmentpkg;


class Car{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti extends Car{
public void method1(){
System.out.println("Maruti-method1");
}
public void method2(){
System.out.println("Maruti-method2");
}
}

public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Maruti();
		c1.method2();     //The method method2() is undefined for the type Car

	}

}

/*
 * Output:
 * The method method2() is undefined for the type Car
 */
	
