//this rupntipme polymorpisam that means function overring support
package latebinding;

class LateBindingCheck
{
    public void walk()
    {
        System.out.println("Parent late");
    }
    
}
class late extends LateBindingCheck
{
    public void walk()
    {
        System.out.println("Overriding parent class");
    }
}
public class LateBinding {

    public static void main(String[] args) {
        LateBindingCheck ob1= new late();
        LateBindingCheck ob2= new LateBindingCheck();
        ob1.walk();
        ob2.walk();
    }
    
}
