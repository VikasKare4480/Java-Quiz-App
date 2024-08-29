import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] answers = new String[5];
    Scanner sc = new Scanner(System.in);
    public QuestionService() {

        questions[0] = new Question(1, "Who invented Java?", "James Gosling", "Bill Gates", "Steve Jobs", "Larry Page", "James Gosling");
        questions[1] = new Question(2, "Which Is My Country?", "India", "Pakistan", "Bangladesh", "USA", "India");
        questions[2] = new Question(3, "What is the capital of India?", "Delhi", "Mumbai", "Kolkata", "Chennai", "Delhi");
        questions[3] = new Question(4, "Which river flows through India?", "Ganges", "Nile", "Mississippi", "Amazon", "Ganges");
        questions[4] = new Question(5, "Which is the highest mountain in India?", "Mount Everest", "K2", "Kanchenjunga", "Mount Kilimanjaro", "Kanchenjunga");
    }

    public void playQuiz() {

        System.out.println("Welcome to Java Quiz Application!");
        int ansIndex = 0;
        int quizScore = 0;

        for(Question question : questions) { 

            System.out.println("Question " + question.getQuestion());
            System.out.println("Option A : " + question.getOpt1());
            System.out.println("Option B : " + question.getOpt2());
            System.out.println("Option C : " + question.getOpt3());
            System.out.println("Option D : " + question.getOpt4()); 
            System.out.print("Enter Answer : ");
            String option = answers[ansIndex++] = sc.nextLine();

            if(option.toLowerCase().toString().equals(question.getAnswer().toLowerCase())) {

                quizScore++;
            }
        }
        return;
    }

    public int getQuizScore() {

        int score = 0;

        for(int i = 0; i < answers.length; i++) {

            String rightAnswer = questions[i].getAnswer();
            String enteredAnswer = answers[i];

            if(rightAnswer.toLowerCase().toString().equals(enteredAnswer.toLowerCase())) {

                score++;
            }
        }
        return score;
    }
}
