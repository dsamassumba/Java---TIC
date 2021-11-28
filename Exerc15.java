import java.util.*;
class Exerc15{
    public static void main(String[]args){
        int a,b,c=0;
        Scanner ler=new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        a=ler.nextInt(); 
        System.out.print("Informe o segudo valor: ");
        b=ler.nextInt();
         if(a>0 && b>0){
System.out.print(""+(Math.pow(b,a)));
}
   else{
      System.out.print("usaste valor negativo!");
    }     
  }
}