import java.util.*;
class Exerc8{
    public static void main(String[]args){
    float lmaior,lmenor;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe a base maior: ");
        lmaior=ler.nextFloat();
        System.out.print("Informe a base menor: ");
        lmenor=ler.nextFloat();
        System.out.print("Quadrado = "+(lmaior*lmenor));
    }
}