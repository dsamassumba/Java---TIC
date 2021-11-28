import java.util.Scanner;
 class Exerc22{
     public static void main(String []args){
      float salario,com;
      Scanner ler=new Scanner(System.in);
      System.out.print("Informe o seu salario: ");
      salario=ler.nextFloat();
      System.out.print("Informe o  valor de vendas: ");
      com=ler.nextFloat();
      System.out.println("Comisao: "+((com*4)/100));
        System.out.println("Salario: "+(((com*4)/100)+salario));
     }
 }
