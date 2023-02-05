package br.uern.di.poo.unidade1.construcao;

public enum EnumPorta {

    PORTASIMPLES ("Madeira Compensada", "Fechadura Simples", 50),
    PORTAPADRAO ("Madeira Andiroba", "Fechadura Encaixe", 140),
    PORTALUXO ("Madeira Ipê","Fechadura Tetra", 350);

    private final String tipoMadeira, tipoFechadura;
    private final Integer valor;

    EnumPorta(String tipoMadeira, String tipoFechadura, Integer valor) {
        this.tipoMadeira = tipoMadeira;
        this.tipoFechadura = tipoFechadura;
        this.valor = valor;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }
    public String getTipoFechadura() {
        return tipoFechadura;
    }
    public int getValor() {
        return valor;
    }
}
