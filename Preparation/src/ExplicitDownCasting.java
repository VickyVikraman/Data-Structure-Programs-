class E
{
    int i = 10;
}
 
class B extends E
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class F extends C
{
    int m = 40;
}
 
public class ExplicitDownCasting
{
    public static void main(String[] args)
    {
        E a = new E();
        B b = (B) a;   //A type is explicitly downcasted to B type
        C c = (C) a;   //A type is explicitly downcasted to C type
        F d = (F) a;   //A type is explicitly downcasted to D type
        B b1 = new B();
        F d1 = (F) b1;  //B type is explicitly downcasted to D type
        d1 = (F) new C();  //C type is explicitly downcasted to D type
    }
}