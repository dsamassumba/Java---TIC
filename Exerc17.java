import java.util.Scanner;
  class Exerc17{
      public static void main(String [] args){
          float saldo,s;
          Scanner ler =new Scanner(System.in);
          System.out.print("Informe o seu saldo actual: ");
          saldo=ler.nextFloat();
          s=(saldo*25)/100;
          float soma=s+saldo;
          System.out.print("Salario novo: "+soma);
      }
  }