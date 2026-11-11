package OOP.FILES_EXPORT;

public class MarksCheck {
    int marks;
    boolean isValid;
    public MarksCheck(int marks){
        this.marks = marks;
        CheckMarks(marks);

    }
    int CheckMarks(int marks){
        if(marks >= 0 && marks <= 100){
            isValid = true;
            return 1;
        }
        else{
            isValid = false;
            return 0;
        }
    }
}
