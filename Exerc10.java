import java.util.Scanner;
public class Exerc10{
    public static void main(String[]args){
        float bmaior,bmenor,altura;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe a base maior: ");
        bmaior=ler.nextFloat();
        System.out.print("Informe a base menor: ");
        bmenor=ler.nextFloat();
        System.out.print("Informe a altura: ");
        altura=ler.nextFloat();
        System.out.print("Quadrado = "+((bmaior+bmenor)*altura)/2);
    }
}