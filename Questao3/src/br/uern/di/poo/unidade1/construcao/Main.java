package br.uern.di.poo.unidade1.construcao;

public class Main {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta (EnumPorta.PORTASIMPLES, 2.0, 1.0, true);
        Porta porta3 = new Porta (EnumPorta.PORTAPADRAO, 2.6, 1.7, false);
        Porta porta4 = new Porta (EnumPorta.PORTALUXO, 2.8, 1.9, true);

        System.out.println("================== Porta 1 ==================");
        porta1.exibePorta();
        System.out.println("\nO preço da porta é: R$ " + porta1.calculaPreco());
        System.out.println("O valor da instalação é: R$ " + Servicos.precoServico(porta1));
        System.out.println("=============================================");
        System.out.println("================== Porta 2 ==================");
        porta2.exibePorta();
        System.out.println("\nO preço da porta é: R$ " + porta2.calculaPreco());
        System.out.println("O valor da instalação é: R$ " + Servicos.precoServico(porta2));
        System.out.println("=============================================");
        System.out.println("================== Porta 3 ==================");
        porta3.exibePorta();
        System.out.println("\nO preço da porta é: R$ " + porta3.calculaPreco());
        System.out.println("O valor da instalação é: R$ " + Servicos.precoServico(porta3));
        System.out.println("=============================================");
        System.out.println("================== Porta 4 ==================");
        porta4.exibePorta();
        System.out.println("\nO preço da porta é: R$ " + porta4.calculaPreco());
        System.out.println("O valor da instalação é: R$ " + Servicos.precoServico(porta4));
        System.out.println("=============================================");
    }
}