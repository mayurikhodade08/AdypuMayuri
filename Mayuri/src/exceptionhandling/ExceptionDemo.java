package exceptionhandling;

public class ExceptionDemo {
	
	 private void checkArithmeticException(){
	        try {
	            int a=0;
	            int result=10/a;
	            System.out.println("result : "+result);
	        }
	        catch (ArithmeticException e){
	            System.out.println(e.getMessage());

	        }
	        restOfTheCode();
	    }

	    private  void checkNullPointerException(){
	        try {
	            String s = null;
	            int length = s.length();
	            System.out.println(length);
	        }
	        catch (NullPointerException e){
	            System.out.println(e);
	        }
	        finally{
	        	System.out.println("inside the finally block");
	        	
	        }
	        restOfTheCode();
	        }

	    private void restOfTheCode(){
	        System.out.println("Rest of the code");
	    }

	    public static void main(String[] args) {

	        ExceptionDemo demo=new ExceptionDemo();
	        demo.checkNullPointerException();

	    }

	}
