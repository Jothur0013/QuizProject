package quiz.aplicacao.console;

import quiz.framework.QuizTemplate;
import quiz.framework.Pergunta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeuquizConsole extends QuizTemplate {
    @Override
    protected List<Pergunta> carregarPerguntas(){
        List<Pergunta> perguntasJ = new ArrayList<>();
        perguntasJ.add(new Pergunta("Orcas são?", Arrays.asList("Baleias", "Peixes", "Golfinhos", "Tubaroes" ), "Golfinhos"));
        perguntasJ.add(new Pergunta("Qual o maior time brasileiro na libertadores?", Arrays.asList("Flamengo", "Fluminense", "Palmeiras", "Sao Paulo"), "Flamengo"));
        perguntasJ.add(new Pergunta("Quem é um pouco mais louco que todos nós?", Arrays.asList("ShigeoNomura", "Monark", "Lula", "Bolsonaro"), "ShigeoNomura"));
        return perguntasJ;
    }

}
