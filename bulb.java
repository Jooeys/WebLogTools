public class bulb {
	
	boolean status=false;
	int power=1000;
	
	
	public void on(){
		status = true;
	}
	
	
	public void off(){
		status= false;
	}
	
	
	public void show(){
		System.out.print("功率："+power+"W ");
		if(status) System.out.println("状态："+ "ON");
		else System.out.println("状态："+ "OFF");
	}
	
}
