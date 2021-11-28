import java.util.Scanner;
class Exerc29{
    public static void main(String[]args){
        double A=0.38,salario,D;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o seu deposito: ");
        salario=ler.nextDouble();
        double K=salario*A;
        D=K/100;
        System.out.print("Saldo actual: "+(salario-D-D));
    }
}