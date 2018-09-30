package design.pattern;

public class Singleton{
	
	// http://thecodersbreakfast.net/index.php?post/2008/02/25/26-de-la-bonne-implementation-du-singleton-en-java
	
    /** Constructeur privé */
    private Singleton()
    {}
     
    /** Instance unique non préinitialisée */
    private static Singleton INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static Singleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Singleton(); 
        }
        return INSTANCE;
    }
}