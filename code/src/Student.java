
public class Student {
	private String fname, lname, classLevel;
	private double rank;
	
	public Student(){
		this.fname = null;
		this.lname = null;
		this.classLevel = null;
		rank=0.0;
	}
	public Student(String fname, String lname, String classLevel, double rank){
		this.fname = fname;
		this.lname = lname;
		this.classLevel = classLevel;
		this.rank=rank;
		
	}
	
	public void addRank(double x){
		rank+=x;
	}

	/**
	 * @return the rank
	 */
	public double getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(double rank) {
		this.rank = rank;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the classLevel
	 */
	public String getClassLevel() {
		return classLevel;
	}

	/**
	 * @param classLevel the classLevel to set
	 */
	public void setClassLevel(String classLevel) {
		//classLevel=classLevel.toLowerCase();
		
		//if(classLevel.)
		this.classLevel = classLevel;
	}
	
	public int compareTo(Student e) {

		Student p = (Student) e;
		if (rank > p.getRank()) {
			return -1;

		}

		else if (rank < p.getRank()) {
			return 1;
		}

		else {
			return 0;
		}
	}
	
	public String toString(){
		return fname+" "+lname+" '"+classLevel+"' "+rank+"\n";
	}
	
}
