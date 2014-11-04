public class test3{
  public static void main(String[] args){
    Test test = new Test();
    test.run();
   /* A a = new A();
    a.a();*/
  }
}
/*
class Test{
  public void run(){
    Character a = new Character('A');
    for(char c=97;c <123 +1; c++){
      System.out.println(c);
    }
  //文字コードの取得
  System.out.println((int)'安');
  System.out.println((int)'里');
  System.out.println((int)'和');
  System.out.println((int)'樹');
  //文字コードからの表示
  System.out.println((char)23433);
  System.out.println((char)37324);
  System.out.println((char)21644);
  System.out.println((char)27193);
  }
}
*/

class A {
  public void a(){
  char[] a = {23433,37324,21644,27193};
  System.out.print(a);
//  System.out.print((int)a);
  
  }
}

