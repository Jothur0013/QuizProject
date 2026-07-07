package quiz.aplicacao.programacao;

import quiz.framework.Pergunta;
import quiz.framework.PerguntaFactory;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList ;
public class PerguntaFactoryProgramacao  implements PerguntaFactory {

    public List<Pergunta> criarPerguntas() {
        List<Pergunta> perguntas = new ArrayList<>();

        // Adiciona as perguntas usando a classe Pergunta do seu colega
        perguntas.add(new Pergunta(
                "O que é Polimorfismo?",
                Arrays.asList(
                        "A) Capacidade de um objeto assumir várias formas.",
                        "B) Joao Arthur aura67.",
                        "C) Joao Arthur."
                ),
                "A"
        ));

        perguntas.add(new Pergunta(
                "O que significa a sigla POO?",
                Arrays.asList(
                        "A) Programação Orientada a Objetos.",
                        "B) Programação Orientada a AURA.",
                        "C) Padrão Orientado a 67."
                ),
                "A"
        ));

        return perguntas;
    }
}