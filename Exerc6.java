import java.util.*;
class Exerc6{
    public static void main(String[]args){
        float a,b,c,pa,pb,pc;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe a primeira nota:");
        a=ler.nextFloat();
        System.out.print("Informe o seu peso:");
        pa=ler.nextFloat();
        System.out.print("Informe a segunda nota:");
        b=ler.nextFloat();
        System.out.print("Informe o seu peso:");
        pb=ler.nextFloat();
        System.out.print("Informe a terceira nota:");
        c=ler.nextFloat();
        System.out.print("Informe o seu peso:");
        pc=ler.nextFloat();

      System.out.print("ponderada: "+((a*pa+b*pb+c*pc/pa+pb+pc)));

    }
}