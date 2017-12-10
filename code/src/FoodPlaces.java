import java.util.ArrayList;

public class FoodPlaces {
	String name;
	ArrayList<String> recycle;
	ArrayList<String> compost;
	ArrayList<String> landfill;
	
	public FoodPlaces(String n){
		name=n;
		recycle=new ArrayList<>();
		compost=new ArrayList<>();
		landfill=new ArrayList<>();;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
