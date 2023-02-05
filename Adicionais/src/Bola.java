import java.lang.Math;

public class Bola {

    private final ParOrdenado PCentral;

    private Integer Vx;

    private Integer Vy;
    private Integer cte;

    private final Integer R = cte;

    public Bola(ParOrdenado PCentral, Integer vx, Integer vy, Integer cte) {
        this.PCentral = PCentral;
        Vx = vx;
        Vy = vy;
        this.cte = cte;
    }

    public Integer getVx() {
        return Vx;
    }

    public void setVx(Integer vx) {
        Vx = vx;
    }

    public Integer getVy() {
        return Vy;
    }

    public void setVy(Integer vy) {
        Vy = vy;
    }

    public ParOrdenado getPCentral() {
        return PCentral;
    }

    public Integer getCte() {
        return cte;
    }

    public Integer getR() {
        return R;
    }

    public ParOrdenado movimenta (){
        if (Vy < 0)
            PCentral.setY(PCentral.getY() + Math.abs(Vy));
        else if (Vy > 0)
            PCentral.setY(PCentral.getY() - Math.abs(Vy));
        else if (Vx > 0)
            PCentral.setX(PCentral.getX() + Math.abs(Vx));
        else if (Vx < 0)
            PCentral.setX(PCentral.getX() - Math.abs(Vx));
        return PCentral;
    }

    @Override
    public String toString() {
        return "A bola está na posição ( " + PCentral.getX() + " , " + PCentral.getY() + " ) se movendo a uma velocidade (" + this.Vx + " , " + this.Vy + " ) pixels por movimento";
    }
}
