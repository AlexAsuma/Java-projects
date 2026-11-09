package OOP.STUDENT;

public class Students {
    String name, regNo, courseName;
    int Marks;
    calcGrade grade = new calcGrade();

    Students(String name, String regNo, String courseName, int Marks){
            this.name = name;
            this.regNo = regNo;
            this.courseName = courseName;
            this.Marks = Marks;
    }

}
