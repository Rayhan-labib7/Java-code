
package stringimmutable;

class operation
{
    int squre(int x)
    {
        return x*x;
    }
}
class circle
{
    operation agg; //aggregation

    int area(int radius)
    {
        agg= new operation();
        int cal=agg.squre(radius)*3;//code reusability
        return cal;
    }
    
}
public class StringImmutable {
    
  
  
    public static void main(String[] args) {
     
   circle ob1=new circle();
   int result=ob1.area(5);
   System.out.println(result);
   
    
    }
    
}
