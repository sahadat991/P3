package constructor;

public class testHouse {
	
	public static void main(String[] args){
		House myHouse = new House("WhiteHouse");
		//myHouse.setHouseName("WhiteHouse");
		System.out.println(myHouse.getHouseName());
		myHouse.setAddress(32);
		System.out.println(myHouse.getAddress());
		
	}
	
		
	
}
