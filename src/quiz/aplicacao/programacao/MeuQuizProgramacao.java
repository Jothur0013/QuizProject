package quiz.aplicacao.programacao;
import quiz.framework.QuizTemplate;


public class MeuQuizProgramacao  extends QuizTemplate {
    public MeuQuizProgramacao() {
        super(new PerguntaFactoryProgramacao());
    }
}