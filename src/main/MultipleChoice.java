package main;

public class MultipleChoice extends Question{

    // fields - properties - class variables

    // constructors
    // (1) takes in a question & answer
    public MultipleChoice(String question, String answer) {
        // (2) then passes them to the parent Question class using "super"
        super(question, answer);
    }

    // methods
    @Override
    public boolean isCorrect(String answer) {
        // (3) compares user's answer with the answer from the Question class with the getAnswer getter
        // (4) make sure comparison isn't case sensitive
        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
