package math.algo;

import java.math.BigInteger;

public class CalculCombi {
	// https://www.dcode.fr/combinaisons
		
	public int factorielleIterative(int n) {
	    int produit = 1;
	    for (int i=1; i<=n; i++)
	        produit *= i;
	    return produit;
	}
	public int factorielleRecursive(int n) {
	    if (n>1)
	        return n*factorielleRecursive(n-1);
	    else
	        return 1;
	}
	public static BigInteger factorielleGrandNombre(int n) {
	    BigInteger produit = BigInteger.ONE;
	    BigInteger mul = BigInteger.ONE;
	    for (int i = 1; i <= n; i++ , mul = mul.add(BigInteger.ONE))
	        produit = produit.multiply(mul);
	    return produit;
	}


	
	public int calculNbPair(int n){
		if(n>1)
			return n * ((n - 1) /2);
		else
			return 0;
	}
	public int calculNbCombinaisons(int n, int elements){
		if(n>=elements)
			return factorielleRecursive(n)/(factorielleRecursive(elements)*factorielleRecursive(n - elements));
		else
			return 0;
	}
}
