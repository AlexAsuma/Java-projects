package OOP.STUDENT;

public class Students {
    String name, regNO, course;
    int marks;
    char grade;


    public Students(String name, String regNO, String course, int marks){
        CalcGrade calcGrade = new CalcGrade(marks);
        this.name = name;
        this.regNO = regNO;
        this.course = course;
        this.marks = marks;
        this.grade = calcGrade.grade;

    }



}
