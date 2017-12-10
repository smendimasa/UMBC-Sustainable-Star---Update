
public class GUIManager {

	University univ1;
	GenericUtilitySort bubbleSort = new GenericUtilitySort();
	public GUIManager(){
		univ1=new University();
	}
	
	public String getFoodList(String str){
		String s1=univ1.getFoodList(str);
		System.out.println(s1);
		return s1;
	}
	
	public String getRank(){
		bubbleSort.bubbleSort(univ1.getStudentsArrayList());
		return bubbleSort.print(univ1.getStudentsArrayList());
	}
	
	public void addRank(double num){
		
	}
	
}
