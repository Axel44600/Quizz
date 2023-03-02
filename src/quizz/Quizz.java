package quizz;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Quizz {
    private List<String> questions;
    private List<String> answers;

    public List<String> getQuestions() {
        return questions;
    }
    public List<String> getAnswers() {
        return answers;
    }

    public void openQuizz() {
        try
        {
            URL uQ = getClass().getResource("questions.txt");
            URL uA = getClass().getResource("answers.txt");
            assert uQ != null;
            Path pQuestions = Paths.get(uQ.toURI());
            assert uA != null;
            Path pAnswers = Paths.get(uA.toURI());

            questions = Files.readAllLines(pQuestions, StandardCharsets.UTF_8);
            answers = Files.readAllLines(pAnswers, StandardCharsets.UTF_8);

        } catch(IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
