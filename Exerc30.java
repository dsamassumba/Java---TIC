import java.util.Scanner;
class Exerc30{
    public static void main(String[]args){
        float saco;
        int quantr;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informeo o peso do saco: ");
        saco=ler.nextFloat();
        System.out.print("Informeo a quantidade de racao diaria: ");
        quantr=ler.nextInt();
        System.out.print("Restara: "+(saco-(quantr*2*5*0.001)));
    }
}