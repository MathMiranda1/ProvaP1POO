public class Aposta {

    private Integer ValorApostado;
    private Resultado resultado;
    private Evento evento;

    public Aposta(Evento evento, Resultado resultado, Integer valorApostado ) {
        super();
        ValorApostado = valorApostado;
        this.resultado = resultado;
        this.evento = evento;
    }

    public Integer getValorApostado() {
        return ValorApostado;
    }

    public void setValorApostado(Integer valorApostado) {
        ValorApostado = valorApostado;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Double calculaLucro (Evento evento) {
        double lucro = 0;
        boolean Aposta = true;
        if (Aposta){
            if (resultado == Resultado.TIME1)
                lucro = evento.getOdd1() * ValorApostado;
            else if (resultado == Resultado.EMPATE)
                lucro = evento.getOdd2() * ValorApostado;
            else if (resultado == Resultado.TIME2)
                lucro = evento.getOdd3() * ValorApostado;
        }
        return lucro;
    }
}
