package main;

public abstract class Question {

    /* First, design a base class (called Question) that contains the common features, and design subclasses for
    each of the question types. For each question type be sure to include:

        Class name
        Fields and properties with access modifiers
        Methods with access modifiers
        Any inheritance relationship

        Should any of the question classes be abstract? If so, should any of its methods be abstract?

        Make sure that there is functionality included to display the questions, to display the possible answers,
        and to check to see if the answer(s) is correct.
     */

    // properties - class variables
    private String question;
    private String answer;

    // constructors
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // getters & setters
    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    // methods
    public abstract boolean isCorrect(String answer);
}
