class Ex3{

  public String ex3_0(int n){

    if(n>0){
      return "その値は正です";
    }else{
      return "その値は０か負です";
    }

  }

  public int ex3_1(int n){

    if (n >= 0.0)
      return n;
    else
      return -n;
  }
  public String ex3_2(int a, int b){

    if(a % b == 0){
        return b + "は" + a + "の約数です";
    }else{
        return b + "は" + a + "の約数ではありません";
    }
  }

  public String ex3_3(int a, int b){

    if(b < a){
        return a + "の方が大きいです";
    }else if(a < b){
        return b + "の方が大きいです";
    }else{
        return "同じ値です";
    }

  }

  public String ex3_4(int a){

    if(0 > a){
        return "正でない整数値です";
    }else if(a % 5 == 0){
        return "その値は5で割り切れます";
    }else{
        return "その値は5で割り切れません";
    }
  }

  public String ex3_5(int a){

    if(a % 10 == 0){
        return "その値は10の倍数です";
    }else if(0 > a){
        return "正でない整数値です";
    }else{
        return "その値は10の倍数ではありません";
    }
  }

  public String ex3_6(int a){
    if(a % 3 == 0){
        return "その値は3で割り切れます";
    }else if(a % 3 == 1){
        return "その値を3で割った余りは1です";
    }else if(a % 3 == 2){
        return "その値を3で割った余りは2です";
    }else{
        return "正でない整数値です";
    }
  }

  public String ex3_7(int a){
    if(0 <= a && a <= 59){
        return"不可";
    }else if(60 <= a && a <= 69){
        return"可";
    }else if(70 <= a && a <= 79){
        return"良";
    }else if(80 <= a && a <= 100){
        return"優";
    }else{
        return"範囲(0～100)外の値です";
    }

  }

  public double ex3_8(double a, double b){
    
    if(a < b){
        return b;
    }else{
        return a;
    }
  }

  public int ex3_9(int a, int b){
    int c = (a - b);
    return c;
  }



  public String ex3_10(int a, int b){
    
    int c = (a -b);

    if(c > 10){
        return"それらの差は11以上です";
    }else{
        return"それらの差は10以下です";
    }
  }

  public int ex3_11(int a, int b, int c){
    
    int intMin[] = {a, b, c};
    int i,min;
    min = intMin[0];

    for (i = 0; i < 2; i++){
    
        if(min > intMin[i]){
          min = intMin[i];
          return min;
        }else{
          return 0;
    }

    }
    return 0;
  }

  public int ex3_12(int a, int b, int c){
    int[] intArray = {a, b, c};
    return intArray[1];
  }

  public String ex3_13(int a){
    return "dummy";
  }

}
