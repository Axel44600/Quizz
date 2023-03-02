import quizz.Quizz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Quizz quizz = new Quizz();
       quizz.openQuizz();

        System.out.println("Bonjour, bienvenue dans le quizz !");
        System.out.println("Comment t'appelles-tu ?");
        Scanner sc = new Scanner(System.in);
        String namePlayer = sc.nextLine();
        System.out.println("Très jolie prénom, "+namePlayer+" j'espère que tu est prêt(e) !");
        System.out.println("C'est parti !");
        int scorePlayer = 0;

        for(int i = 0; i < quizz.getQuestions().size(); i++) {
            String question = quizz.getQuestions().get(i);
            String answer = quizz.getAnswers().get(i);
            System.out.println(question);
            String answerPlayer = sc.nextLine();
            if(answerPlayer.equals(answer)) {
                scorePlayer++;
                System.out.println("Bonne réponse, tu gagnes un point !");
                System.out.println("Ton score est désormais de "+scorePlayer+" point(s).");
            } else {
                System.out.println("Et non, mauvaise réponse !");
                System.out.println("Correction : " +answer);
            }
        }
        sc.close();
        System.out.println("FIN DU QUIZZ");
        System.out.println("Score final : "+scorePlayer+" point(s)");
    }
}