import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Quiz {
    private final List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Collections.shuffle(questions);
        Scanner scanner = new Scanner(System.in);

        for (Question currentQuestion : questions) {
            System.out.println(currentQuestion.prompt);
            for (String option : currentQuestion.options) {
                System.out.println(option);
            }

            char userAnswer;
            while (true) {
                System.out.print("Your answer : ");
                String input = scanner.next().toUpperCase();
                if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                    userAnswer = input.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }

            if (userAnswer == currentQuestion.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + currentQuestion.correctAnswer + "\n");
            }
        }
        displayResults();
        scanner.close();
    }

    private void displayResults() {
        System.out.println("----- Quiz Finished -----");
        System.out.printf("Your final score is: %d/%d%n", score, questions.size());
    }
}