import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;



public class University {
	ArrayList<Student> studentsArrayList;
	ArrayList<FoodPlaces> fPlaces;
	private StringTokenizer strTokenizer1, strTokenizer2;
	private String fName;
	
	
	public University(){
		//Scanner inputFile = new Scanner(System.in);;
		//Scanner scan= new Scanner(System.in);
		fName="";
		studentsArrayList=new ArrayList<>();
		fPlaces=new ArrayList<>();
		setPlaces();
		readFile();
		
	}
	
	public String login(String n){
		for(Student st: studentsArrayList){
			if(st.getFname().equalsIgnoreCase(n)){
				this.fName=st.getFname();
			}
	}
		
		if(fName=="")
			return "";
		else
			return fName;
	}
	
	public String getUserName(){
		return fName;
	}
	
	public String getClassLevel(String n){
		String classL="";
	
		for(Student st: studentsArrayList){
			if(st.getFname().equalsIgnoreCase(n)){
				classL=st.getClassLevel();
			}
		}
		return classL;
	}
	public void addStudent(String fname, String lname, String classL){
		this.fName=fname;
		Student d1= new Student(fname, lname, classL, 0.0);
		studentsArrayList.add(d1);
	}

	public void addRank(String fN, double r){
		for(Student st: studentsArrayList){
			if(st.getFname().equalsIgnoreCase(fN)){
				st.addRank(r);
			}
		}
	}
	/**
	 * @return the studentsArrayList
	 */
	public ArrayList<Student> getStudentsArrayList() {
		return studentsArrayList;
	}
	
	public ArrayList<FoodPlaces> getPlacesArrayList(){
		return fPlaces;
	}
	
	public String getFoodList(String name){
		String recyle="Recyle: ";
		String compost="Compost: ";
		String landfill="Landfill: ";
		for(int x=0; x<fPlaces.size(); x++){
			
			if(name.equalsIgnoreCase(fPlaces.get(x).getName())){
			for(String str: fPlaces.get(x).recycle){
				recyle=recyle+str+", ";
			}
			
			for(String str: fPlaces.get(x).compost){
				compost=compost+str+", ";
			}
			for(String str: fPlaces.get(x).landfill){
				landfill=landfill+str+", ";
			}
			}
			
		}
		
		recyle+="\n";
		compost+="\n";
		landfill+="\n";
		return (recyle+compost+landfill);
	}
	
	
	public void setPlaces(){
		FoodPlaces p1=new FoodPlaces("Salsaritas");
		p1.compost.add("fruits");
		p1.compost.add("cups");
		p1.compost.add("napkins");
		p1.compost.add("fries holder");
		
		p1.recycle.add("plastic bowls");
		p1.recycle.add("plastic bottles");
		p1.recycle.add("paper");
		
		p1.landfill.add("utensils");
		p1.landfill.add("bags");
		p1.landfill.add("foam");
		p1.landfill.add("straws");
		p1.landfill.add("cups top");
		
		fPlaces.add(p1);
		FoodPlaces p2=new FoodPlaces("Masala");
		p2.compost.add("fruits");
		p2.compost.add("cups");
		p2.compost.add("napkins");
		p2.compost.add("fries holder");
		
		p2.recycle.add("Nothing");
		
		
		p2.landfill.add("utensils");
		p2.landfill.add("bags");
		p2.landfill.add("foam");
		p2.landfill.add("straws");
		p2.landfill.add("cups top");
		
		
		fPlaces.add(p2);
		
		FoodPlaces p3=new FoodPlaces("AuBonPain");
		p3.compost.add("fruits");
		p3.compost.add("cups");
		p3.compost.add("napkins");
		p3.compost.add("color cups");
		p3.compost.add("tea bags");
		p3.compost.add("sugar packs");
		
		
		p3.recycle.add("coffe holder");
		p3.recycle.add("plastic cups");
		p3.recycle.add("cups tops");
		
		
		p3.landfill.add("utensils");
		p3.landfill.add("straws");
		
		fPlaces.add(p3);
		
		
	}
	
	public  void readFile() {
		// opens the file

		File f = new File("info.txt");
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(f);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		// suggestion is to add all to a string before manipulating it.
		String day = "";
		
		
		//strTokenizer1 = new StringTokenizer(inputFile.nextLine(), ";");
		while (inputFile.hasNextLine()) {
			strTokenizer1 = new StringTokenizer(inputFile.nextLine(), ";");
		day=strTokenizer1.nextToken();
		//day=inputFile.nextLine()+"\n";
		String daySplit []=day.split(" ");
		
		
		String fname=daySplit[0];
		String lname=daySplit[1];
		String classVal=daySplit[2];
		double rank=Double.parseDouble(daySplit[3]);
		
		
		//System.out.print(rank);
		Student s1= new Student(fname, lname, classVal, rank);
		//StudentInfo sInfo=new StudentInfo();
		//sInfo.setCurrentSTudent(s1);
		studentsArrayList.add(s1);
		}
	

		inputFile.close();

	}
	/**
	 * @param studentsArrayList the studentsArrayList to set
	 */
	/*
	public void addStudentsArrayList() {
		this.studentsArrayList = studentsArrayList;
	}
	
	*/
	

}
