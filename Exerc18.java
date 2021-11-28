import java.util.*;
class Exerc18{
    public static void main(String[]args){
        float preco,D;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o preco do produto: ");
        preco=ler.nextFloat();
        D=(preco*10)/100;
        System.out.print("Desconto: "+(preco-D));
    }
}