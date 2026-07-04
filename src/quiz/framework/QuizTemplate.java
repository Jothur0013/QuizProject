package quiz.framework;

import java.util.List;
public abstract class QuizTemplate {
    public int acertos = 0, erros = 0, pontFinal = 0;
    public final void iniciarQuiz(QuizUI interfaceGrafica, PontuacaoStrategy estrategiadePontos){
        int acertos = 0, erros = 0, pontFinal = 0;
        List<Pergunta> perguntasQuiz = carregarPerguntas();

    for (Pergunta pergunta : perguntasQuiz){
        interfaceGrafica.exibePergunta(pergunta);
        String respostaUsuario = interfaceGrafica.usuarioResposta();
        while(!interfaceGrafica.analisePergunta(pergunta))
            {respostaUsuario = interfaceGrafica.usuarioResposta();}
        boolean acertou = pergunta.getResposta().equalsIgnoreCase(respostaUsuario);

        if (acertou){
            acertos++;}
        else {
            erros++;}
        interfaceGrafica.feedback(acertou);

        pontFinal += estrategiadePontos.calculaPontuacao(acertou);};
    interfaceGrafica.exibePontuacaoFinal(acertos, erros, pontFinal);}

    protected abstract List<Pergunta> carregarPerguntas();


}
