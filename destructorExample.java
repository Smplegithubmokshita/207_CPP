class demo
{
   demo(int x){
      System.out.println(x);
      }
      protected void finalize()
      {
         System.out.println("object is destroyed by garbage collector");
         }
         }
     public class destructorExample
     {
       public static void main(String args[])
       {
         demo d1=new demo(23);
         d1.finalize();
         d1=null;
         System.out.println("Inside the main method");
         }
         }