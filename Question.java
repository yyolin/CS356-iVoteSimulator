/*****************************************************************
 * file: Question.java
 * author: TszWai Yan
 * class: CS356 - Object-Oriented​ ​Design​ ​and​ ​Programming
 * 
 * assignment: Programming​ ​Assignment​ ​1​ ​-​ ​iVote​ ​Simulator
 * date last modified: 10/16/2017
 * 
 * purpose: This is a class of question, where each question has 
 * its own title and a line of question. Each question also has 
 * a list of answers to choose from. Also, there is a boolean type
 * to decide whether there can only be one answer or multiple 
 * answers.
 * 
 *****************************************************************/

import java.util.ArrayList;

/**
 *
 * @author yyan
 */
public class Question {
    private String title;
    private String question;
    private ArrayList<String> answers;
    private boolean singleType;
    
    public Question() {
        this.title = null;
        this.question = null;
        this.answers.clear();
        singleType = false;
    }
    
    public Question(String title, String question, ArrayList<String> answers, 
            boolean singleType) {
        this.title = title;
        this.question = question;
        this.answers = (ArrayList<String>)answers.clone();
        this.singleType = singleType;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getQuestion() {
        return this.question;
    }
    
    public String[] getAnswer() {
        String[] a = this.answers.toArray(new String[this.answers.size()]);
        return a;
    }
    
    public String getAnswer(int i) {
        return this.answers.get(i);
    }
    
    public boolean getType() {
        return this.singleType;
    }
    
    public void setTitle(String t) {
        this.title = t;
    }
    
    public void setQuestion(String q) {
        this.question = q;
    }
    
    public void setType(boolean s) {
        this.singleType = s;
    }
    
    public void addAnswer(String a) {
        answers.add(a);
    }
    
    public void removeAnswer(int i) {
        answers.remove(i);
    }
}
