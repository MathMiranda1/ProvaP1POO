import java.util.Random;
import java.util.Scanner;

public class TesteCampo2 {

    public static void main(String[] args) {

        Integer altura, largura, raio, VelocidadeH, VelocidadeV;

        ParOrdenado PosicaoInicialCampo = new ParOrdenado(0,0);
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite o valor da altura do campo: ");
        altura = Scanner.nextInt();
        System.out.println("Digite o valor da largura do campo: ");
        largura = Scanner.nextInt();
        System.out.println("Digite o valor do raio da bola: ");
        raio = Scanner.nextInt();
        ParOrdenado PosicaoBola = new ParOrdenado(largura/2, altura/2);

        Random Random = new Random();

        Integer VelocidadeHorizontal = 0;
        while (VelocidadeHorizontal < 5) {
            VelocidadeHorizontal = Random.nextInt(11);
        }
        VelocidadeH = largura * VelocidadeHorizontal/100;
        System.out.println("Velocidade Horizontal (X) da bola: " + VelocidadeH);

        Integer VelocidadeVertical = 0;
        while (VelocidadeVertical < 5) {
            VelocidadeVertical = Random.nextInt(11);
        }
        VelocidadeV = largura * VelocidadeVertical/100;
        System.out.println("Velocidade Horizontal (X) da bola: " + VelocidadeV);

        Bola bola = new Bola(PosicaoBola, VelocidadeH, VelocidadeV, raio);
        CampoRetangular CampoRetangular = new CampoRetangular(PosicaoInicialCampo, largura, altura, bola);

        for (int i = 0; i < 30; i++) {
            CampoRetangular.movimentaBola();
            System.out.println(bola.toString());
        }
    }
}
