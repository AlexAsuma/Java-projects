package OOP.STUDENT;

public class EmptyCheck {
    String input;
    boolean isValid;

    public EmptyCheck(String input){
        this.input = input;
        checkEmpty(input);
    }

    public void checkEmpty(String input){
        if(input != null && !input.trim().isEmpty()){
            this.isValid = true;

        }else {
            this.isValid = false;
        }
    }
}
