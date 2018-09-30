import java.io.File;
import java.util.ArrayList;

import convert.ascii.ASCIIConvertor;
import math.algo.CalculCombi;
import search.file.repository.SearchFile;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		//test.testFilesControle();
		//test.testCalculCombi();
		
		//test.testASCIIConvertor();
		

		ArrayList a =new ArrayList(2);
		a.add(1);
		a.add(1);
		a.add(1);
		// a.size = 3
		
		int i = 2;
		int j = 5;
		int b = (i/j);
		// b = 0
		
		int r;
		// erreur pour System.out.println(r);
		
		System.out.println(b);
		
		String z = "a";
		String x = "a";
		String y = x;
		// tout à true pour equals et ==
		
		
		System.out.println();
		
		// difference entre HashSet, HashMap et LinkedList et Vector
		// hashcode d'un objet ? si egaux alors objet egaux ?
		// Déclarer une classe sans niveau d'accès explicite est en général conseillé
		// Le Garbage Collector garanti qu'il y a suffisamment de mémoire pour executer un programme java
		// pointeurs
		// operations entre binaires
		
	}
	
	public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > n2 && array[i] <= n1)
                sum+= array[i];
        }
        return sum; 
	}
	
	public void testFilesControle(){
		SearchFile search = new SearchFile();
		System.out.println(search.scanDir("C:/Users/ywick/OneDrive/Documents/Cours Dev/Cours JS"));
	
		File repository = new File("C:/Users/ywick/OneDrive/Documents/Cours Dev/Cours JS");
		System.out.println(search.fileExist("06-JSLogo.png", repository)); //Type d'Evenements.png
		
		File file = search.searchFile("06-JSLogo.png", new File("C:/Users/ywick/OneDrive/Documents/Cours Dev/Cours JS"));
		System.out.println(file.getAbsolutePath());
	}
	public void testCalculCombi(){
		CalculCombi c = new CalculCombi();
		System.out.println(c.calculNbPair(10));
		System.out.println(c.calculNbCombinaisons(10, 3));
	}
	public void testASCIIConvertor(){
		ASCIIConvertor conv = new ASCIIConvertor();
		System.out.println(conv.convertASCIICodeToCharLIMITED("47"));
		System.out.println(conv.convertASCIICodeToChar("201"));
		System.out.println(conv.convertCharToASCIICode("a"));
		System.out.println(conv.convertCharToASCIICode("A simple Java program"));
	}
	
}
