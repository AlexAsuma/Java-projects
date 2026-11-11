package OOP.FILES_EXPORT;

public class CalcGrade {
int marks;
char grade;
    public CalcGrade(int marks){
        this.marks = marks;
        this.grade = GradeCalculation();
    }

    public char GradeCalculation(){
        if (marks >= 70 && marks <= 100) {
            return 'A';
        } else if (marks < 70 && marks >= 60) {
            return 'B';
        } else if (marks < 60 && marks >= 50) {
            return 'C';
        } else if (marks < 50 && marks >= 40) {
            return 'D';
        } else{
            return 'F';
        }
    }


}
