import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Quizz {

    private String urlFileQuestions = "C:\\Users\\Gaudin\\Projet_JAVA\\ExerciceQuizz\\src\\questions.txt";
    private String urlFileAnswers = "C:\\Users\\Gaudin\\Projet_JAVA\\ExerciceQuizz\\src\\answers.txt";
    private List<String> listOfQuestions;
    private List<String> listOfAnswers;
    public List<String> getListOfQuestions() {
        return listOfQuestions;
    }
    public List<String> getListOfAnswers() {
        return listOfAnswers;
    }

    public void OpenQuizz() {
        try
        {
            listOfQuestions = new ArrayList<String>();
            listOfAnswers = new ArrayList<String>();
            // Le fichier d'entrée
            File questions = new File(urlFileQuestions);
            File answers = new File(urlFileAnswers);
            // Créer l'objet File Reader
            FileReader qu = new FileReader(questions);
            FileReader an = new FileReader(answers);
            // Créer l'objet BufferedReader
            BufferedReader brQu = new BufferedReader(qu);
            BufferedReader brAn = new BufferedReader(an);

            String line;
            while((line = brQu.readLine()) != null) {
               listOfQuestions.add(line);
            }
            qu.close();
            while((line = brAn.readLine()) != null) {
                listOfAnswers.add(line);
            }
            an.close();

            System.out.println(listOfQuestions.get(0));
            System.out.println(listOfAnswers.get(0));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
