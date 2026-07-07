package quiz.aplicacao.console;

import quiz.framework.PerguntaFactory;
import quiz.framework.QuizTemplate;
import quiz.framework.Pergunta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeuquizConsole extends QuizTemplate {

public MeuquizConsole () {
     super(new PerguntaFactoryConsole());

    }
}


