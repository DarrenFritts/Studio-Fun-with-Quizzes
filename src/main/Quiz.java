package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    /* Then design the Quiz class. A quiz has a list of questions, and we should be able to:

        Add questions
        Run or carry out the quiz
        Grade the quiz

     */

    // fields - properties - class variables
    // create an ArrayList to hold all of the questions
    private ArrayList<Question> questions = new ArrayList<Question>();
    // create a variable to keep track of how many questions were answered correctly
    private int numCorrectAnswers = 0;
    // create a scanner for user to input answers to questions
    private Scanner scanner = new Scanner(System.in);

    // constructors
    public Quiz() {
        //
    }

    // methods
    // Add Questions
    // add a question of any type (multiple choice, checkbox, or true/false) to the ArrayList "questions"
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    // Run the Quiz
    // ask user each question
    public void runQuiz() {
        // loop through questions
        for (Question question : questions) {
            // display questions for user to read
            System.out.println(question.getQuestion());
            // get user's answer using getAnswerFromUser() method
            String usersAnswer = this.getAnswerFromUser();
            // check user's answer against question's answer
            boolean userAnswerCorrect = question.isCorrect(usersAnswer);
            // if userAnswerCorrect, increment numCorrectAnswers variable
            if (userAnswerCorrect) {
                this.numCorrectAnswers++;
            }
        }

        // Grade the Quiz by dividing # correct answers by # of questions times 100 for percentage
        double quizPercentageCorrect = ((double) this.numCorrectAnswers / (double) this.questions.size()) * 100;
        System.out.println("Your quiz grade is " + quizPercentageCorrect + "%");
    }

    // get user's input answer
    private String getAnswerFromUser() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }

}
