import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso, altura,imc;

        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();

        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura); //Altura em metros e peso em Kg

        if(imc <= 18.5 ){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        }
        else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }
        else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        }
        else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else if(imc >= 40.0){
            System.out.println("Obesidade Grau III (Mórbida)");
        }
        


        sc.close();
    }
}
