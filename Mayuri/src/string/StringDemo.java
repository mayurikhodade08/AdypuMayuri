package string;

public class StringDemo {
public static void main(String[]args){
	String s="java";
	String s1="java";
	String s2=new String("java");
	System.out.println("hash of s: "+s.hashCode());
	s=s.concat(" training");
	
	if(s.equals(s2)){
		System.out.println("true");
	}
	else{
		System.out.println(false);
	}
	System.out.println("location of string: "+s.hashCode());
	System.out.println("location of string: "+s1.hashCode());
	System.out.println("s; "+s+"\nhash: "+s.hashCode());
		
}
}
