public class Evento {
    private String fase, time1, time2;
    private Double odd1, odd2, odd3;
    private Resultado resultado;
    public Evento(String fase, String time1, String time2, Double odd1, Double odd2, Double odd3) {
        this.fase = fase;
        this.time1 = time1;
        this.time2 = time2;
        this.odd1 = odd1;
        this.odd2 = odd2;
        this.odd3 = odd3;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public Double getOdd1() {
        return odd1;
    }

    public void setOdd1(Double odd1) {
        this.odd1 = odd1;
    }

    public Double getOdd2() {
        return odd2;
    }

    public void setOdd2(Double odd2) {
        this.odd2 = odd2;
    }

    public Double getOdd3() {
        return odd3;
    }

    public void setOdd3(Double odd3) {
        this.odd3 = odd3;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}


