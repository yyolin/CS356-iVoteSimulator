/********************************************************************
 * file: Student.java
 * author: TszWai Yan
 * class: CS356 - Object-Oriented​ ​Design​ ​and​ ​Programming
 * 
 * assignment: Programming​ ​Assignment​ ​1​ ​-​ ​iVote​ ​Simulator
 * date last modified: 10/16/2017
 * 
 * purpose: This is a class of Student, where each student has 
 * his/her own unique id and answers. Both the id and answers are 
 * stored as string. 
 * 
 ********************************************************************/

public class Student {
    
    private String ID;
    private String answer;
    
    public Student() {
        this.ID = null;
        this.answer = null;
    }
    
    public Student(String ID, String answer) {
        this.ID = ID;
        this.answer = answer;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
