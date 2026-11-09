package OOP.STUDENT;

public class calcGrade {
    int Grade;
   public char calcGrade(int grade){
       this.Grade = grade;

           if (grade >= 70 && grade <= 100) {
               return 'A';
           } else if (grade < 70 && grade >= 60) {
               return 'B';
           } else if (grade < 60 && grade >= 50) {
               return 'C';
           } else if (grade < 50 && grade >= 40) {
               return 'D';
           } else{
               return 'F';
           }

   }
}
