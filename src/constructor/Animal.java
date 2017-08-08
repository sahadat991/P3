package constructor;

public class Animal {
	    String name, breed, location;
	  
	    public Animal() {
	    	name = "Dog";
	    	breed = "wow";
	    	location = "USA";
	    			
	    }
	    
	    public Animal(String name) {
	        this.name = name;
	        }
	 
	    public Animal(String name, String breed, String location) {
	        this.name = name;
	        this.breed = breed;
	        this.location = location;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

}
