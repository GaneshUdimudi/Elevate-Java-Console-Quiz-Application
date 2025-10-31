import java.util.ArrayList;
import java.util.List;

public class QuizApp {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        
        questions.add(new Question(
            "1. What is the heart of the Java platform?",
            new String[]{"A. JRE", "B. JDK", "C. JVM", "D. JAR"},
            'C'
        ));
        
        questions.add(new Question(
            "2. Which class is the root of the Java class hierarchy?",
            new String[]{"A. java.util.List", "B. java.util.ArrayList", "C. java.lang.Object", "D. java.lang.String"},
            'C'
        ));

        questions.add(new Question(
            "3. What keyword is used to create an instance of a class?",
            new String[]{"A. new", "B. instance", "C. create", "D. this"},
            'A'
        ));

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}