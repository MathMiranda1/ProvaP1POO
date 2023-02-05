public class CampoRetangular {

    private ParOrdenado CSE;
    private Integer Comprimento;
    private Integer Altura;
    private Bola ball;

    public CampoRetangular(ParOrdenado CSE, Integer comprimento, Integer altura, Bola ball) {
        this.CSE = CSE;
        Comprimento = comprimento;
        Altura = altura;
        this.ball = ball;
    }

    public ParOrdenado getCSE() {
        return CSE;
    }

    public Integer getComprimento() {
        return Comprimento;
    }

    public Integer getAltura() {
        return Altura;
    }

    public Bola getBall() {
        return ball;
    }

    public Boolean BolaTocaBordaEsquerda() {
        if ((ball.getPCentral().getX() - ball.getR()) <= CSE.getX()){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean BolaTocaBordaDireita() {
        if ((ball.getPCentral().getX() + ball.getR()) >= Comprimento){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean BolaTocaBordaSuperior() {
        if ((ball.getPCentral().getY() - ball.getR()) <= CSE.getY()){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean BolaTocaBordaInferior() {
        if ((ball.getPCentral().getY() + ball.getR()) >= Altura){
            return true;
        }
        else{
            return false;
        }
    }

    public void movimentaBola() {
        if (BolaTocaBordaEsquerda()) {
            ball.setVx(-1 * ball.getVx());
        }
        else if (BolaTocaBordaDireita()) {
            ball.setVx(-1 * ball.getVx());
        }
        else if (BolaTocaBordaSuperior()) {
            ball.setVy(-1 * ball.getVy());
        }
        else if (BolaTocaBordaInferior()) {
            ball.setVy(-1 * ball.getVy());
        }
        ball.movimenta();
    }
}
