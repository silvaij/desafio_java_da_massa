import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1020V2 {
    public static void main (String[] args ) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Integer idadeDias;
        Integer mes , dia , resto , ano;

        try {
            idadeDias = Integer.parseInt(input.readLine());

            ano = idadeDias / 365;
            resto = (idadeDias % 365);
            mes = resto / 30;
            dia = (resto % 30);

            System.out.println(ano + " ano (s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dia + " dias");

        }catch (NumberFormatException exception){
            System.out.println(exception+" numero invalido");
        }
    }
}
