class Singleton {

   private static final Singleton singleton = new Singleton( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private Singleton() { }

   /* Static 'instance' method */
   public static  Singleton getInstance( ) {
      return singleton;
   }

   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton");
   }
}
public class SingletonDemo 
{
   public static void main(String[] args)
   {
      Singleton tmp = Singleton.getInstance( );
      Singleton.demoMethod( );
      
      
      StringBuilder s1 = new StringBuilder("Java");
      String s2 = "Love";
      s1.append(s2);
      System.out.println(s1.substring(4));
      int foundAt = s1.indexOf(s2);
      System.out.println(foundAt);
   }
}