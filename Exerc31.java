import java.util.Scanner;
class Exerc31{
    public static void main(String[]args){
        float salarim,kilow;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o salario minimo: ");
        salarim=ler.nextFloat();
        System.out.print("Informe a quantidae de quilowatts: ");
        kilow=ler.nextFloat();
        float D=salarim/5;
        System.out.println("Custo de cada quilowatts:"+D);
         System.out.println("O valor a ser pago:"+(D*kilow));
         float P=(D*kilow*15)/100;
         System.out.println("Valor a ser pago com desconto:"+(D*kilow-(P)));

    }
}