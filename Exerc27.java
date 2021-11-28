import java.util.Scanner;
class Exerc27{
    public static void main(String[]args){
        float precof,plucro,pimposto;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o preco de fabrica: ");
        precof=ler.nextFloat();
         System.out.print("Informe a percenatagem de lucro: ");
        plucro=ler.nextFloat();
         System.out.print("Informe a percentagem de imposto: ");
        pimposto=ler.nextFloat();
        System.out.println("Lucro do distribuidor:"+(((plucro*precof)/100)));
        System.out.println("Impostos:"+(((pimposto*precof)/100)));
        System.out.println("Custo Total:"+(precof+(((plucro*precof)/100)))+((pimposto*precof)/100));
    }
}