package br.uern.di.poo.unidade1.construcao;

public class Porta {

    private EnumPorta enumPorta;
    private Double Altura;
    private Double Largura;
    private Boolean Pivotante;
    private final Double A = 1.8;
    private final Double L = 0.7;
    private final Integer Incremento = 350;

    public Porta() {
        this.enumPorta = EnumPorta.PORTASIMPLES;
        Pivotante = false;
        Altura = A;
        Largura = L;
    }

    public Porta(EnumPorta enumPorta, Double altura, Double largura, Boolean pivotante) {
        this.enumPorta = enumPorta;
        this.Altura = altura;
        this.Largura = largura;
        this.Pivotante = pivotante;
    }

    public EnumPorta getEnumPorta() {
        return enumPorta;
    }

    public void setEnumPorta(EnumPorta enumPorta) {
        this.enumPorta = enumPorta;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public Double getLargura() {
        return Largura;
    }

    public void setLargura(Double largura) {
        Largura = largura;
    }

    public Boolean getPivotante() {
        return Pivotante;
    }

    public void setPivotante(Boolean pivotante) {
        this.Pivotante = pivotante;
    }

    public Double getA() {
        return A;
    }

    public Double getL() {
        return L;
    }
    public Integer getIncremento() {
        return Incremento;
    }

    public Double calculaPreco() {
        double precoPorta = 0;
        if (enumPorta == EnumPorta.PORTASIMPLES) {
            if (!Pivotante)
                precoPorta = Altura * Largura * EnumPorta.PORTASIMPLES.getValor();
            else
                precoPorta = (Altura * Largura * EnumPorta.PORTASIMPLES.getValor()) + Incremento;
        }
        else if (enumPorta == EnumPorta.PORTAPADRAO) {
            if (!Pivotante)
                precoPorta = Altura * Largura * EnumPorta.PORTAPADRAO.getValor();
            else
                precoPorta = (Altura * Largura * EnumPorta.PORTAPADRAO.getValor()) + Incremento;
        }
        else if (enumPorta == EnumPorta.PORTALUXO) {
            if (!Pivotante)
                precoPorta = Altura * Largura * EnumPorta.PORTALUXO.getValor();
            else
                precoPorta = (Altura * Largura * EnumPorta.PORTALUXO.getValor()) + Incremento;
        }
        return precoPorta;
    }

    public void exibePorta() {
        if (enumPorta == EnumPorta.PORTASIMPLES)
            System.out.print ("As características são: " + EnumPorta.PORTASIMPLES.getTipoFechadura() + " e " + EnumPorta.PORTASIMPLES.getTipoMadeira() + " e o valor por m² é: " + EnumPorta.PORTASIMPLES.getValor());
        else if (enumPorta == EnumPorta.PORTAPADRAO)
            System.out.print ("As características são: " + EnumPorta.PORTAPADRAO.getTipoFechadura() + " e " + EnumPorta.PORTAPADRAO.getTipoMadeira() + " e o valor por m² é: " + EnumPorta.PORTAPADRAO.getValor());
        else if (enumPorta == EnumPorta.PORTALUXO)
            System.out.print ("As características são: " + EnumPorta.PORTALUXO.getTipoFechadura() + " e " + EnumPorta.PORTALUXO.getTipoMadeira() + " e o valor por m² é: " + EnumPorta.PORTALUXO.getValor());
    }

}