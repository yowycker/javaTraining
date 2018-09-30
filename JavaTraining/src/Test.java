import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

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
		
		/*difference entre HashSet, HashMap et LinkedList et Vector :
		 * HashSet : list qui assure aucun doublon (avec equals surement)
		 * HashMap ne donne aucune garantie quant à l'ordre d'itération. 
		 	Il peut (et va) même changer complètement lorsque de nouveaux 
		 	éléments sont ajoutés.
     	 * TreeMap effectuera une itération en fonction de "l'ordre naturel" 
     	 	des clés en fonction de leur méthode compareTo () (ou d'un comparateur 
     	 	fourni en externe). En outre, il implémente l'interface SortedMap, qui 
     	 	contient des méthodes qui dépendent de cet ordre de tri.
     	 * LinkedHashMap itérera dans l'ordre dans lequel les entrées ont été placées 
     	 	dans la carte
     	 --> VOIR maplist()
		 */
		/*hashcode d'un objet
		 * permet d'identifier l'objet en agglomeration : utilise Equals...
		 */
		// Déclarer une classe sans niveau d'accès explicite est en général conseillé
			// OUI
		// Le Garbage Collector garanti qu'il y a suffisamment de mémoire pour executer un programme java
			// NON : gérer la mémoire notamment en libérant celle des objets qui ne sont plus utilisés
		
		
		// pointeurs
		// thread
		
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
	
	public void maplist(){
		Map m1 = new HashMap();
		m1.put("map", "HashMap");
		m1.put("schildt", "java2");
		m1.put("mathew", "Hyden");
		m1.put("schildt", "java2s");
		System.out.println(m1.keySet()); 
		System.out.println(m1.values()); 

		SortedMap<String, String> sm = new TreeMap();
		sm.put("map", "TreeMap");
		sm.put("schildt", "java2");
		sm.put("mathew", "Hyden");
		sm.put("schildt", "java2s");
		System.out.println(sm.keySet()); 
		System.out.println(sm.values());

		LinkedHashMap lm = new LinkedHashMap();
		lm.put("map", "LinkedHashMap");
		lm.put("schildt", "java2");
		lm.put("mathew", "Hyden");
		lm.put("schildt", "java2s");
		System.out.println(lm.keySet()); 
		System.out.println(lm.values());
	}
	
}
