import java.util.Scanner;

public class Questao1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data MM/DD/AAAA: ");
        String data = input.nextLine();
        String[] tokens = data.split("/");

        String[] Meses = { "", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        System.out.printf("%s %s, %s", Meses[Integer.parseInt(tokens[0])], tokens[1], tokens[2]);
    }
}