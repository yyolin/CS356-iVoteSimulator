/**********************************************************************
 * file: SimulationDriver.java
 * author: TszWai Yan
 * class: CS356 - Object-Oriented​ ​Design​ ​and​ ​Programming
 * 
 * assignment: Programming​ ​Assignment​ ​1​ ​-​ ​iVote​ ​Simulator
 * date last modified: 10/16/2017
 * 
 * purpose: This program automatically simulate the whole process of
 * the iVote service where this program create a question and configure 
 * the answers first. Then, this program randomly generate a number of
 * students and answers. The answers will be submitted to the iVote 
 * Service, where the iVote Service will then take account of the answers
 * to display the result.
 * 
 **********************************************************************/

import java.util.ArrayList;

public class SimulationDriver {

    public static void main(String[] args) {
        System.out.println("*This is a sample test of the iVote Service.*");
        String title = "Sample Test";
        String question = "Which drink has the most sugar?";
        ArrayList<String> choices = new ArrayList<>();
        boolean type = true;
        choices.add("Soda");
        choices.add("Juice");
        choices.add("Energy drinks");
        choices.add("Coffee");
        choices.add("Sugar water");
        
        Question a = new Question(title, question, choices, type);
        IVoteService service = new IVoteService(a);
        service.printQuestion();
        
        service.addStudAns("2");
        service.addStudAns("123");
        service.addStudAns("4");
        service.addStudAns("5");
        service.addStudAns("5");
        
        System.out.println("");
        service.printResult();
    }
    
}
