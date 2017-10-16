/***********************************************************************
 * file: IVoteService.java
 * author: TszWai Yan
 * class: CS356 - Computer Graphics
 * 
 * assignment: Programming​ ​Assignment​ ​1​ ​-​ ​iVote​ ​Simulator
 * date last modified: 10/16/2017
 * 
 * purpose: The iVote Service that handles the whole Question and Answer
 * choices process.This program will configure a given question type, 
 * answers, and it accepts submissions from students afterward. It also
 * handle printing of the questions, answers, and results.
 * 
 ***********************************************************************/

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class IVoteService {
    private Question q;
    private Student s;
    private ArrayList<Student> sList = new ArrayList<>();
    private int min = 1000000;
    private int max = 10000000;
    
    public IVoteService() {
    }
    
    public IVoteService(Question q) {
        this.q = q;
    }
    
    public void addStudAns(String a) {
        int id = ThreadLocalRandom.current().nextInt(min, max);
        for(int i = 0; i < sList.size(); i++) {
            Student temp = sList.get(i);
            
            if(temp.getID().equals(id)) {
                id = ThreadLocalRandom.current().nextInt(min, max);
            }
        }
        
        if(q.getType() == true && a.toCharArray().length > 1) {
            int lastChar = a.length();
            a = Character.toString(a.charAt(lastChar - 1));
        }
        
        this.s = new Student(Integer.toString(id), a);
        sList.add(s);
    }
    
    public void changeStudAns(String id, String a) {
        for(int i = 0; i < sList.size(); i++) {
            Student temp = sList.get(i);
            
            if(temp.getID().equals(id)) {
                temp.setAnswer(a);
            }
        }
    }
    
    public void printQuestion() {
        System.out.println("Title: " + q.getTitle() + "\nQuestion: " + 
                q.getQuestion() + "\nChoices:");
        String[] c = q.getAnswer();
        for(int i = 0; i < c.length; i++) {
            System.out.println((i+1) + ". " + c[i]);
        }
    }
    
    public void printResult() {
        if(sList.size() > 0) {
            int[] counter = new int[q.getAnswer().length];
            
            for(int i = 0; i < sList.size(); i++) {
                Student temp = sList.get(i);
                String tempa = temp.getAnswer();
                if(q.getType() == true) {
                    counter[Integer.parseInt(tempa) - 1]++;
                } else {
                    for(int j = 0; j < tempa.length(); j++) {
                        counter[Character.getNumericValue(tempa.charAt(j)) - 1]++;
                    }
                }
            }
            
            System.out.println("Result: ");
            for(int k = 0; k < counter.length; k++) {
                System.out.println((k + 1) + " " + counter[k]);
            }
        } else {
            System.out.println("No result submitted yet.");
        }
    }
}
