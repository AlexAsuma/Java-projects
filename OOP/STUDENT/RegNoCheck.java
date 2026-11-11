package OOP.STUDENT;

public class RegNoCheck {
    String regNO;
    boolean isValid;

    public RegNoCheck(String regNO){
        this.regNO = regNO;
        checkRegNo(regNO);
    }

    public void checkRegNo(String regNo){
        String pattern = "^[A-Za-z0-9]+/[0-9]+/[0-9]+$";
        if(regNo != null && regNo.matches(pattern)){
            this.isValid = true;
        } else {this.isValid = false;}


    }
}
