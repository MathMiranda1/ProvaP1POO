import java.util.Random;
import java.util.Scanner;

public class TesteCampo {

    public static void main(String[] args) {

        // Posição Inicial da Bola

        Integer altura, largura, raio, VelocidadeHorizontal, VelocidadeVertical;
        String posicao;

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a posição da bola (x,y): ");
        posicao = Scanner.next();
        String[] posicaointeiro = posicao.split(",");
        Integer x = Integer.parseInt(posicaointeiro[0]);
        Integer y = Integer.parseInt(posicaointeiro[1]);
        ParOrdenado PosicaoInicialBola = new ParOrdenado(x, y);

        ParOrdenado PosicaoInicialCampo = new ParOrdenado(0,0);
        System.out.println("Digite o valor de X da posição do campo: ");
        PosicaoInicialCampo.setX(Scanner.nextInt());
        System.out.println("Digite o valor de Y da posição do campo: ");
        PosicaoInicialCampo.setY(Scanner.nextInt());
        ParOrdenado PosicaoInicalCampo = new ParOrdenado(PosicaoInicialCampo.getX(),PosicaoInicialCampo.getY());

        System.out.println("Digite o valor da altura do campo: ");
        altura = Scanner.nextInt();
        System.out.println("Digite o valor da largura do campo: ");
        largura = Scanner.nextInt();
        System.out.println("Digite o valor da velocidade horizontal da bola: ");
        VelocidadeHorizontal = Scanner.nextInt();
        System.out.println("Digite o valor da velocidade vertical da bola: ");
        VelocidadeVertical = Scanner.nextInt();
        System.out.println("Digite o valor do raio da bola: ");
        raio = Scanner.nextInt();

        Bola bola = new Bola(PosicaoInicialBola, VelocidadeHorizontal, VelocidadeVertical, raio);
        CampoRetangular CampoRetangular = new CampoRetangular(PosicaoInicalCampo, largura, altura, bola);

        System.out.println("Posição inicial da bola :"+ bola.toString());

        for (int i = 0; i < 30; i++) {
            CampoRetangular.movimentaBola();
            System.out.println(bola.toString());
        }
    }
}
