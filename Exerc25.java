import java.util.Scanner;
class Exerc25{
    public static void main(String[]args){
        float deposito,taxa;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o valor do deposito: ");
        deposito=ler.nextFloat();
        System.out.print("Informe a taxa: ");
        taxa=ler.nextFloat();
        System.out.println("Rendimento: "+taxa);
        System.out.println("Valor total: "+(taxa+deposito));
    }
}