import java.util.*;
class Exerc7{
    public static void main (String[]args){
        float lmaior,lmenor;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o losangulo maior: ");
        lmaior=ler.nextFloat();
        System.out.print("Informe o losangulo menor: ");
        lmenor=ler.nextFloat();
        System.out.print("Area="+((lmaior*lmenor)/2));
    }
}