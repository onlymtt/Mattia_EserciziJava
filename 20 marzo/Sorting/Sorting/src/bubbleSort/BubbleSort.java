package bubbleSort;

/*
 *  
 *@author Mattia Santitto
 *@version 1.0
 *
 * 
 * */

import java.util.LinkedList;

public class BubbleSort {

	public static void main(String[] args) {

		try {
			//dichiaro la lista di interi da ordinare
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(14);
			linkedList.add(3);
			linkedList.add(9);
			linkedList.add(1);
			linkedList.add(8);
			
			//richiamo il metodo per fare il sorting
			bubbleSort(linkedList);
			
			//stampo la lista riordinata
			System.out.println("Lista ordinata");
			for (int elem : linkedList) {
				System.out.println(elem);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	/*
	 * @param linkedList; una linkedList di interi
	 * */
	public static void bubbleSort(LinkedList<Integer> linkedList) {
		for (int i = 0; i < linkedList.size()-1; i++) {

			for (int j = 0; j < linkedList.size()-i-1; j++) {

				if (linkedList.get(j) > linkedList.get(j+1)) { //se trova due elementi da ordinare, li scambia
					int temp = linkedList.get(j);
					linkedList.set(j, linkedList.get(j+1));
					linkedList.set(j+1, temp);

				}
			}
		}
	}

}
