import java.util.Scanner;
class Exerc19{
    public static void main(String[]args){
        float salario, perc;
        Scanner ler =new Scanner(System.in);
        System.out.print("Informe o seu salario: ");
        salario=ler.nextFloat();
        System.out.print("Informe percentual de aumento: ");
        perc=ler.nextFloat();
     float A=(salario*perc)/100;
     System.out.print("Novo salario: "+(salario+A));
    }
}