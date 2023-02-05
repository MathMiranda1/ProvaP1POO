package br.uern.di.poo.unidade1.construcao;

//import static br.uern.di.poo.unidade1.construcao.Porta.Pivotante;

public class Servicos {

    private static final Double Percentual = 0.1;
    private static final Integer Instalacao = 70;
    private static final Integer adicionalPorta = 250;
    private static Porta porta;


    public static Double getPercentual() {
        return Percentual;
    }

    public static Integer getInstalacao() {
        return Instalacao;
    }

    public static Integer getAdicionalPorta() {
        return adicionalPorta;
    }

    public static Double precoServico(Porta porta) {
        double precoServico = 0;
        if (porta.getEnumPorta() == EnumPorta.PORTASIMPLES) {
            if (!porta.getPivotante())
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao());
            else
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao()) + getAdicionalPorta();
        } else if (porta.getEnumPorta() == EnumPorta.PORTAPADRAO) {
            if (!porta.getPivotante())
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao());
            else
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao()) + getAdicionalPorta();
        } else if (porta.getEnumPorta() == EnumPorta.PORTALUXO) {
            if (!porta.getPivotante())
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao()) + getPercentual();
            else
                precoServico = (porta.getAltura() * porta.getLargura() * getInstalacao()) + getAdicionalPorta() + getPercentual();
        }
        return precoServico;
    }
}
