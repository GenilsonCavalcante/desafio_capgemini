package questao_02;

import java.util.regex.Pattern;

public class VerificadorDeSenha {
   
   private String senha;

   public String getSenha() {
      return senha;
   }
   public void setSenha(String senha) {
      this.senha = senha;
   }

   public void verificarSenhaForte() {

      String numeros = "";
      String letrasMinusculas = ""; 
      String letrasMaiusculas = ""; 
      String caracteresEspeciais = "";
      int pontosSenha = 0;

      //VALIDAÇÃO PARA A SENHA
      if (!Pattern.compile("[0-9]").matcher(senha).find()) {
         numeros = "Números, ";
         pontosSenha++;
      }
      if (!Pattern.compile("[a-z]").matcher(senha).find()) {
         letrasMinusculas = "Letras Minúsculas, ";
         pontosSenha++;
      }
      if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
         letrasMaiusculas = "Letras Maiúsculas, ";
         pontosSenha++;
      }
      if (!Pattern.compile("[^\\w]").matcher(senha).find()) {
         caracteresEspeciais = "Caracteres Especiais, ";
         pontosSenha++;
      }
     
      //FEEDBACK DA SENHA DIGITADA
      if (pontosSenha > 0 && senha.length() < 6) {
         System.out.println("Sua senha é fraca, digite pelo menos mais " + (6 - senha.length()) + " caracteres");
         System.out.println("Ela pode ser melhorada adicionando " + numeros + letrasMinusculas + letrasMaiusculas + caracteresEspeciais + "para sua maior segurança");
      } else if (pontosSenha > 0 && senha.length() >= 6) {
         System.out.println("Sua senha encontra-se com pelo menos 6 dígitos");
         System.out.println("Mas ela ainda pode ser melhorada com " + numeros + letrasMinusculas + letrasMaiusculas + caracteresEspeciais + "para sua maior segurança");
      } else if (pontosSenha == 0 && senha.length() < 6) {
         System.out.println("Digite pelo menos mais " + (6 - senha.length()) + " caracteres para uma senha segura");
      } else {
         System.out.println("Sua senha é forte, possui no mínimo 6 dígitos e encontra-se com os requisitos mínimos de uma senha considerada segura");
      }

   }

}
