package questao_01;

public class EscadaDeAsteriscos {

   private int quantidadeAsteriscos;

   public int getQuantidadeAsteriscos() {
      return quantidadeAsteriscos;
   }

   public void setQuantidadeAsteriscos(int quantidadeAsteriscos) {
      this.quantidadeAsteriscos = quantidadeAsteriscos;
   }

   public void imprimirEscada() {

      String espaco = " ";
      String asterisco = "*";
      int contadorEspacos = quantidadeAsteriscos - 1;
      int contadorAsteriscos = 1;
      
      for (int i = 1; i <= quantidadeAsteriscos; i++) {

         System.out.print(espaco.repeat(contadorEspacos));
         contadorEspacos--;
         
         System.out.print(asterisco.repeat(contadorAsteriscos));
         contadorAsteriscos++;

         System.out.println("");
         
      }
   
   }

}
