import java.util.Locale;
import java.util.Scanner;

public class Test1021 {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double valor = input.nextDouble();

        if (valor > 0)
        {
            double valorNotas = Math.floor(valor);
            
            double valorMoedas = valor - Math.floor(valor);

            int n100;
            int n50;
            int n20;
            int n10;
            int n5;
            int n2;

            int m100;
            int m50;
            int m25;
            int m10;
            int m5;
            int m1;

            System.out.printf("Notas: %f\nMoedas: %f", valorNotas, valorMoedas);

            while (valorNotas > 0)
            {
                if (valorNotas >= 50)
                {

                }
            }

            while (valorMoedas > 0)
            {

            }

        }
    }

}
