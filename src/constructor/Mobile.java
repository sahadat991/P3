package constructor;

public class Mobile {
	
	String Company, Brand, Model, Price;
	
	public Mobile(){
		Company = "Samsung Inc";
		Brand = "Galaxy";
	    Model = "S7";
	    Price = "$650";
	}
	
	public Mobile(String Company){
		this.Company = Company;
	}
	
	public Mobile(String Company, String Brand){
		this.Company = Company;
		this.Brand = Brand;
	}
	
	public Mobile(String Model, String Price, String Man){
		this.Model = Model;
		this.Price = Price;
		Man = "Man";
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

}
