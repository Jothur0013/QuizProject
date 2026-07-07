package quiz.aplicacao.programacao;

import quiz.framework.PontuacaoStrategy;
import quiz.framework.QuizUI;

public class MainSwing {
    public static void main(String[] args) {

        // 1. Cria a interface de exibição Swing
        QuizUI interfaceGrafica = new SwingUI();

        // 2. Cria a estratégia de pontuação

        PontuacaoStrategy estrategia = new PontuacaoProgramacao();

        // 3. Inicializa o Quiz de Programação
        MeuQuizProgramacao quiz = new MeuQuizProgramacao();

        // 4. Dispara a dinâmica do framework
        quiz.iniciarQuiz(interfaceGrafica, estrategia);

        // Finaliza o processo do Swing caso fique travado
        System.exit(0);
    }
 }