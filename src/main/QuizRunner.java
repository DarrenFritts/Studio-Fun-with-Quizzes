package main;

public class QuizRunner {

    public static void main(String[] args) {

        // create a new quiz
        Quiz myQuiz = new Quiz();

        // add a multiple choice question & include the correct answer
        MultipleChoice myMultipleChoice = new MultipleChoice("What is 1 + 1?\nA: 1\nB: 2\nC: 3\nD: 4\nType single letter as your answer", "B");
        myQuiz.addQuestion(myMultipleChoice);

        // add a question that can have more than one correct answer & include the correct answers
        Checkbox myCheckbox = new Checkbox("Select all that apply, Java is?\nA: hard\nB: cool\nC: aggrivating\nD: fun", "A,B,C,D");
        myQuiz.addQuestion(myCheckbox);

        // add a true/false question & include the correct answer
        TrueFalse myTrueFalse = new TrueFalse("I will graduate from LaunchCode this year.", "True");
        myQuiz.addQuestion(myTrueFalse);

        // run the quiz
        myQuiz.runQuiz();
    }

}
