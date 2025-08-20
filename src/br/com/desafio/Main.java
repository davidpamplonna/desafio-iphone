package br.com.desafio;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando funções musicais
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando funções telefônicas
        iphone.ligar("+55 11 99999-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando navegador
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
