class Main {

    public static void main(String[] args) {
        
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        int questionScore = questionService.getQuizScore();
        System.out.println("Your Quiz score is -> " + questionScore);
    }
}