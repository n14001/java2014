public class test{
  public static void main(String[] args){
      Calc f = new Calc();
      f.f();
      Calc w = new Calc();
      w.w();
      Calc d = new Calc();
      d.d();
      Calc e = new Calc();
      e.e();
    }
}
class Calc{
    public void f(){
        //for
      int end =11;
      for(int i=0;i<end;i++){      
      System.out.println("iは"+i+"です。");
      }
    }
    public void w(){
        //while
      int i = 0;
      int end = 11;
      while(i < end){
      System.out.println("iは"+i+"です。");
      i++;
      }
    }
    public void d(){
        //do while
      int i = 0;
      int end = 11;
      do{
      System.out.println("iは"+i+"です。");
      i++;
      }while(i<end);
      
    }
    public int e(){
      int numbers = {3,4,5};    
      int sum = 0;
      for (int number:numbers){
        sum += number;
      }
    }

}
