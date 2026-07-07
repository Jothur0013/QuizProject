package quiz.framework;

import java.util.List;

public abstract class QuizTemplate {

    // A lista de perguntas que o framework vai gerenciar
    protected List<Pergunta> perguntas;


    public QuizTemplate(PerguntaFactory fabricaDePerguntas) {
        this.perguntas = fabricaDePerguntas.criarPerguntas();
    }

    // Atributos da classe para o controle de pontuação
    public int acertos = 0;
    public int erros = 0;
    public int pontFinal = 0;

    // O Template Method que dita o fluxo do jogo
    public final void iniciarQuiz(QuizUI interfaceGrafica, PontuacaoStrategy estrategiadePontos){

        // Iteramos diretamente sobre a lista "this.perguntas" já carregada
        for (Pergunta pergunta : this.perguntas) {

            interfaceGrafica.exibePergunta(pergunta);
            String respostaUsuario = interfaceGrafica.usuarioResposta();

            // Loop para garantir que o usuário digite uma opção válida
            while(!interfaceGrafica.analisePergunta(pergunta)) {
                respostaUsuario = interfaceGrafica.usuarioResposta();
            }

            // Verifica se a resposta está correta
            boolean acertou = pergunta.getResposta().equalsIgnoreCase(respostaUsuario);

            // Atualiza as variáveis da classe (usando o "this.")
            if (acertou) {
                this.acertos++;
            } else {
                this.erros++;
            }

            interfaceGrafica.feedback(acertou);

            // Usa o Strategy para calcular a pontuação
            this.pontFinal += estrategiadePontos.calculaPontuacao(acertou);
        }

        // Exibe o resultado no final do quiz
         interfaceGrafica.exibePontuacaoFinal(this.acertos, this.erros, this.pontFinal);
    }
}