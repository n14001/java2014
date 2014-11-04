public class test2 {
public static void main (String[] args){

    Grade grade =new Grade();
    System.out.println(grade.calc(70));
  }
}
class Grade {
    char calc(int score){
      // 90 >='A' 70 >= 'B' 50 >='C' else ->'D'
    if (score >= 90) {   
        return 'A';
      } else if (score >= 70) {   
        return 'B';
      } else if (score >= 50) {
        return 'C';
      } else {
        return 'D';
      }

          }
}
