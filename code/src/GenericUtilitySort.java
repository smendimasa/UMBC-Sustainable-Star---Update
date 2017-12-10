import java.util.ArrayList;
import java.util.LinkedList;

/**
 * The GenericUtilitySort class makes a generic implementation of the bubble
 * Sort algorithm
 * 
 * @author Sam Mendimasa
 * @version 1 December 22, 2015
 * @param <T>
 *            generic Type
 */
public class GenericUtilitySort<T extends Comparable> {

	/**
	 * Performs the bubble sort algorithm to sort a generic arrayList
	 * 
	 * @param arrayList
	 *            a generic arrayList
	 * @return a sorted generic arrayList
	 */
	public ArrayList<Student> bubbleSort(ArrayList<Student> arrayList) {

		// loop through the arrayList. This loop decreases by 1 with every pass
		for (int lastIndex = arrayList.size() - 1; lastIndex > 0; lastIndex--) {

			// loop from the start of the array to the current lastIndex.
			// lastIndex decreases by one with every pass of the outer loop
			for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

				// ensures that data is being sorted in ascending order
				if (arrayList.get(currentIndex).compareTo(
						arrayList.get(currentIndex + 1)) > 0) {

					// swap the value at the currentIndex with the value in its
					// neighbor
					Student tempVar = arrayList.get(currentIndex);
					arrayList
							.set(currentIndex, arrayList.get(currentIndex + 1));
					arrayList.set(currentIndex + 1, tempVar);

				}// ends if
			}// ends inner for loop
		}// ends outer for loop

		// return the arrayList
		return arrayList;

	}

	/**
	 * Performs the bubble sort algorithm to sort a generic linkedList
	 * 
	 * @param linkList
	 *            a generic LinkedList
	 * @return a sorted generic LinkedList
	 */
	public LinkedList<T> bubbleSort(LinkedList<T> linkList) {

		// loop through the linkList. This loop decreases by 1 with every pass
		for (int lastIndex = linkList.size() - 1; lastIndex > 0; lastIndex--) {

			// loop from the start of the array to the current lastIndex.
			// lastIndex decreases by one with every pass of the outer loop
			for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {

				// ensures that data is being sorted in ascending order
				if (linkList.get(currentIndex).compareTo(
						linkList.get(currentIndex + 1)) > 0) {

					// swap the value at the currentIndex with the value in its
					// neighbor
					T tempVar = linkList.get(currentIndex);
					linkList.set(currentIndex, linkList.get(currentIndex + 1));
					linkList.set(currentIndex + 1, tempVar);

				}// ends if
			}// ends inner for loop
		}// ends outer for loop

		return linkList;

	}

	/**
	 * Returns a String representation of arrayList
	 * 
	 * @param arrayList
	 *            a generic arrayList
	 * @return A String containing values from the arrayList
	 */
	public String print(ArrayList<Student> arrayList) {

		String returnStr = "";
		for (Student index : arrayList) {
			returnStr += index + " ";
		}

		return returnStr;

	}

	/**
	 * Returns a String representation of the linkedList
	 * 
	 * @param linkList1
	 *            a generic linkedList
	 * @return a String containing values from the linkedList
	 */
	public String print(LinkedList<T> linkList1) {

		String returnStr = "";
		for (T index : linkList1) {
			returnStr += index + " ";
		}

		return returnStr;

	}
}
