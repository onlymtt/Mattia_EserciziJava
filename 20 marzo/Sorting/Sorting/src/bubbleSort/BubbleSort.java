package bubbleSort;

/**
 *  
 *@author Mattia Santitto
 *@version 1.0
 *
 * 
 * */

import java.util.LinkedList;
/**
 * Classe del bubble sort*/
public class BubbleSort {
	/**
	 * entrypoint
	 * 
	 * @param args; argomenti che si passano dalla riga di comando al metodo main
	 * */
	public static void main(String[] args) {

		
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
		
	}

	/**
	 * @param linkedList; una linkedList di interi da passare al metodo
	 * 
	 * */
	public static void bubbleSort(LinkedList<Integer> linkedList) {
		for (int i = 0; i < linkedList.size()-1; i++) {

			for (int j = 0; j < linkedList.size()-i-1; j++) {
				/*
				 * Dopo ogni iterazione del ciclo esterno, l'elemento più grande viene spostato in fondo,
				 * quindi non è necessario confrontare nuovamente gli ultimi 
				 * i elementi durante le iterazioni successive. 
				 * */

				if (linkedList.get(j) > linkedList.get(j+1)) {
					/*
					 * confronta un elemento con il successivo, se non sono ordinati li scambia
					 * */
					int temp = linkedList.get(j);
					linkedList.set(j, linkedList.get(j+1));
					linkedList.set(j+1, temp);

				}
			}
		}
	}

}
