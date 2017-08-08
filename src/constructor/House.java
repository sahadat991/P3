package constructor;

public class House {

	//variables
	String houseName;
	int address;
	
	public House(){
		
	}
	
	public House(String houseName){
		this.houseName = houseName;
	}
	
	public House(int address){
		this.address = address;
	}
	
	//methods	
	public void rooms(){
		System.out.println("3bed room");
		
	}
	
	public void kitchen(){
		System.out.println("lets in our kitchen");
	}

	public int add(int value1, int value2) {
		int total = value1 + value2;
		return total;
		
	}
	
	public int Sub(int value1, int value2){
		int total = value1 - value2;
				return total;
	}
	
	public int Multiply(int value1, int value2){
		int total = value1 * value2;
				return total;
	
	}
	
		public void setHouseName(String houseName){
		this.houseName = houseName;
	}
		
		public String getHouseName() {
			return houseName;
	}
		
		public String getHouseNameNaddress(){
		return houseName + " " + address;
	}

		public int getAddress() {
			return address;
		}

		public void setAddress(int address) {
			this.address = address;
		}

}