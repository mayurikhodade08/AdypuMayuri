package keywords;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("default constructor");
		
	}
	ConstructorDemo(int a){
		System.out.println("constructor:"+a);
	}
public static void main(String[] args){
	new ConstructorDemo();
	
}
}
