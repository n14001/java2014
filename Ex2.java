import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63.5;
		y = 18.3;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
                int n;
		x = 63;
		y = 18;
                n = 35;
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
                System.out.println("nの値は" + n + "です。");
		System.out.println("合計は" + (x + y + n) + "です。");
		System.out.println("平均は" + (x + y + n) / 3 + "です。");

	}
}
class Ex2_3 extends Ex{
       void execute(){
                        Scanner stdIn = new Scanner(System.in);
                        System.out.println("読み込んだ整数値をそのまま反復して表示せよ");
                        System.out.print("xの値：");
                        int x = stdIn.nextInt();
                        System.out.println("x ="); 
                        System.out.println("x ="); 
                               }   
}
class Ex2_4 extends Ex{
	void execute(){
			Scanner stdIn = new Scanner(System.in);
			System.out.println("読み込んだ整数値に10を加えた値と10を減じた値を出力せよ");
			System.out.print("xの値：");	
			int x = stdIn.nextInt();
			System.out.println("x + x = " + (x + 10)); 
			System.out.println("x - x = " + (x - 10)); 
		}
}
class Ex2_5 extends Ex{
	void execute(){
                        Scanner stdIn = new Scanner(System.in);
			System.out.println("二つの実数値を読み込み、その和と平均を求めて表示せよ");
			System.out.print("xの値：");	
			int x = stdIn.nextInt();
			System.out.print("yの値：");	
			int y = stdIn.nextInt();
		        System.out.println(" x + y =" +(x + y));
                        System.out.println("x + y / 2 =" + (x + y / 2));
	}
}
class Ex2_6 extends Ex{
        void execute(){
                        Scanner stdIn = new Scanner(System.in);
                        System.out.println("三角形の底辺と高さを実数値で読み込んで、その面積を表示せよ");
                        System.out.print("xの値（底辺）：");  
                        double x = stdIn.nextInt();
                        System.out.print("yの値：（高さ）");  
                        double y = stdIn.nextInt();
                        System.out.println("x * y = " + (x * y) / 2); 
  }
}

public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
	        a.execute();
                a = new Ex2_1();
		a.execute();
                a = new Ex2_2();
		a.execute();
                a = new Ex2_3();
	        a.execute();
                a = new Ex2_4();
		a.execute();	
		a = new Ex2_5();
                a.execute();
                a = new Ex2_6();
		a.execute();	

	}
}
