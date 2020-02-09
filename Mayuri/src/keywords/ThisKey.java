package keywords;

public class ThisKey {
	
	int id;
	String name;
	
	ThisKey(){
		System.out.println("inside the default constructor");
	}
	
	ThisKey(int id,String name){
		this();
		this.id=id;
		this.name=name;
		System.out.println(" constructor output: id:"+id+"\nName :"+name);
		
	}
	
	private void showData(){
		this.getData();
		System.out.println("id: "+id+"\nname"+name);
	}
	private void getData(){
		System.out.println("inside getdata");
	}
	public static void main(String[] args){
		ThisKey key=new ThisKey(1,"abcd");
		key.showData();
		
	}
	

}
