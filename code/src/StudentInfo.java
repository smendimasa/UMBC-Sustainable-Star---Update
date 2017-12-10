import java.util.ArrayList;

public class StudentInfo {

	private ArrayList<Items> studentsItems;
	private Student currentSTudent;
	
	public StudentInfo(){
		currentSTudent=new Student();
		studentsItems=new ArrayList<>();
	}

	/**
	 * @return the studentsItems
	 */
	public ArrayList<Items> getStudentsItems() {
		return studentsItems;
	}

	/**
	 * @param studentsItems the studentsItems to set
	 */
	public void addStudentsItems(Items item) {
		this.studentsItems.add(item);
	}

	/**
	 * @return the currentSTudent
	 */
	public Student getCurrentSTudent() {
		return currentSTudent;
	}

	/**
	 * @param currentSTudent the currentSTudent to set
	 */
	public void setCurrentSTudent(Student currentSTudent) {
		this.currentSTudent = currentSTudent;
	}
	
	public double getAverageRank(){
		double avgRank=0.0;
		
		for(Items x: studentsItems){
			avgRank+=x.getRank();
		}
		
		return avgRank/7;
	}
	
	/*
	public int compareTo(Object e) {
		return currentSTudent.compareTo(e);
	}
	*/
	
	public String toString(){
		return currentSTudent.toString();
	}
	
}
