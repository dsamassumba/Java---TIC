import java.util.*;
class Exerc20{
    public static void main(String[]args){
        float custo,preco;
        Scanner ler =new Scanner(System.in);
        System.out.print("Informe o custo do Espetaculo: ");
        custo=ler.nextFloat();
        System.out.print("Informe o preco do Espetaculo: ");
        preco=ler.nextFloat();
        System.out.print("Convites a ser vendidos: "+(custo/preco));
    }
}