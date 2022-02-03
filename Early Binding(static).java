///this is compile time polymorpisam that  means function overloding
 class EarlyBinding {
    
     static void start(int a)
     {
         
         System.out.println("parent start");
     }
     static void start()
     {
         System.out.println("parent stop");
     }
    
}


class Main
        {
    public static void main(String[] args) {
        EarlyBinding ob= new EarlyBinding();
        ob.start('x');
        ob.start();
    }
}
