package quiz.aplicacao.console;

import quiz.framework.QuizUI;
import quiz.framework.PontuacaoStrategy;

public class MainConsole {
    public static void main(String[] args){
        MeuquizConsole quiz = new MeuquizConsole();
        QuizUI Console = new ConsoleUI();
        PontuacaoStrategy regraPontos = new PontuacaoConsole();
        quiz.iniciarQuiz(Console, regraPontos);    }
}
