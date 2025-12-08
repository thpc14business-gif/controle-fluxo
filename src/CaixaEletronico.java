public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 150.0;
        double valorSolicitado = 88.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
        else{
            System.out.println("Desculpe, mas o saldo é insuficiente!");
        }
    }
}
