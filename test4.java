public class test4{
  public static void main(String[] args){
    Test test = new Test();
    test.run();
  }
}
class Test{
  public void run(){
    StringBuffer s = new StringBuffer(26);
    for(char c = 'a'; c < 'z' +1; c++){
      s.append(c);
    }
    System.out.print(s);

  }
}

