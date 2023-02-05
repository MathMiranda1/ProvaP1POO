public class UERNBet {

    public static void main(String args[]){
        Evento quartasFinal1 = new Evento ("Quartas de final da copa do mundo",
                "Brasil", "Croácia", 1.18, 1.8, 2.5);
        Evento quartasFinal2 = new Evento ("Quartas de final da copa do mundo",
                "Argentina", "Holanda", 1.4, 1.5, 1.9);

        Aposta aposta1 = new Aposta(quartasFinal1, Resultado.TIME1, 1000);
        Aposta aposta2 = new Aposta(quartasFinal1, Resultado.EMPATE, 400);
        Aposta aposta3 = new Aposta(quartasFinal1, Resultado.TIME2, 300);

        quartasFinal1.setResultado(Resultado.EMPATE);

        if(aposta1.getResultado() == quartasFinal1.getResultado())
            System.out.println("O apostador ganhou R$ " +
                    aposta1.calculaLucro(quartasFinal1));
        else
            System.out.println("O apostador perdeu R$ " +
                    aposta1.getValorApostado());
    }
}