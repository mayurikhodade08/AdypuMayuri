package aggregation;

public class Orders {
	int id;
	String orderid;
	String product;
	User userid;

	Orders(int id,String orderid,String product,User userid){
		this.id=id;
		this.orderid=orderid;
		this.product=product;
		this.userid=userid;
	}
	private void showData(){
		System.out.println("id: "+id);
		System.out.println("orderid: "+orderid);
		System.out.println("product: "+product);
		System.out.println("name: "+userid.name);
	}
	public static void main(String[] args){
		User user=new User(1,"jiyad");
		Orders order=new Orders(1,"ord-1","mobile",user);
		order.showData();
		
		
	}
}
