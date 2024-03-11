    import  java.util.ArrayList;  
import  java.util.Arrays;  

public class EsempioConversioneArray {

public static void  main(String[] args) {    
Integer arr[] = { 1 , 2 , 3 , 4 , 5 , 6 };  
System.out.println( "Array:" +Arrays.toString(arr));  
ArrayList<Integer> arrayList =  new  ArrayList<Integer>(Arrays.asList(arr));  
arrayList .add( 7 );  
arr = arrayList .toArray(arr);  
System.out.println( "Array dopo aver aggiunto l'elemento: " +Arrays.toString(arr)); 
//il limite è che all'interno dell'array non possiamo inserire un oggetto
//la conversione è possibile grazie al polimorfismo
 }  

}

