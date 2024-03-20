package binarysearch;

/**
 * @author Mattia Santitto
 * @version 1.0*/

/**
 * Classe per ricerca binaria*/
public class Binarysearch {
	/**
	 * entrypoint
	 * @param args; argomenti per il main*/
	public static void main(String[] args) {
		int var;

		int[] array = { 3, 7, 10, 15, 16, 19, 32 };

		var = binarySearch(array, 1);
		System.out.println("L'indice dell'elemento cercato è " + var);
	}
	
	/**
	 * metodo per la ricerca binaria
	 * @param array; array in cui cercare il valore che mi interessa
	 * @param var; variabile contenente il numero che voglio cercare nell'array
	 * @return mid; indice del valore cercato o -1 se non trova niente*/
	public static int binarySearch(int[] array, int var) {
		
		/**
		 * left è l'indice sinistro che parte dalla prima posizione
		 * right è l'indice destro che parte dall'ultima*/
		int left;
		int right = array.length - 1;
		
		/**
		 * il ciclo va avanti finchè l'indice sinistro non supera il destro, perchè a quel punto significa
		 * che il valore non è presente nell'array*/
		for (left = 0; left <= right;) {
			
			/**
			 * calcolo il punto medio*/
			int mid = (left + right) / 2;

			/**
			 * se il punto medio è pari, approssimo all'indice precedente*/
			if ((left + right) % 2 == 0) {
				mid = mid - 1;
			}

			/**
			 * se il valore alla posizione mid è quello che cerco, ho finito*/
			if (array[mid] == var) {
				return mid;
			}
			
			/**
			 * se il valore che trovo in mid è maggiore di quello che cerco, significa che il valore cercato
			 * si trova nella metà sinistra, quindi riaggiorno l'indice destro al mid-1 perchè so già 
			 * che in mid c'è un valore che non mi serve*/
			if (array[mid] > var) {
				right = mid - 1;
				
				/**
				 * se il valore che trovo in mid è minore, significa che il valore cercato è nella parte destra
				 * quindi riaggiorno l'indice sinistro a mid+1 */
			} else if (array[mid] < var) {
				left = mid + 1;
			}

		}
		/**
		 * se arrivo a questo punto significa che l'algoritmo non ha trovato il valore cercato*/
		return -1;

	}

}
