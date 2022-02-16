import java.io.IOException;
import java.util.Scanner;
import questao_01.EscadaDeAsteriscos;
import questao_02.VerificadorDeSenha;
import questao_03.EncontarQuantidadeDeAnagramas;

public class App {
    
    public static void limparTelaDoTerminal() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws Exception {

        limparTelaDoTerminal();
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, aqui você pode executar cada uma das questões");
        System.out.println("Digite de 1 a 3 para a questão desejada, escolha 4 para sair: ");
        int questaoDesejada = input.nextInt();
        System.out.println("");

        do {

        switch (questaoDesejada) {
            case 1:    
                //QUESTÃO_01:
                System.out.println("");
                System.out.println("QUESTÃO_01:");
                EscadaDeAsteriscos questao1 = new EscadaDeAsteriscos();
                System.out.println("Digite quantos asteriscos deseja: ");
                int totalDeAsteriscos = input.nextInt();
                questao1.setQuantidadeAsteriscos(totalDeAsteriscos);
                questao1.imprimirEscada();
                System.out.println("");    
            break;
                
            case 2:
                //QUESTÃO_02:
                System.out.println("");
                System.out.println("QUESTÃO_02:");
                VerificadorDeSenha questao2 = new VerificadorDeSenha();
                System.out.println("Digite sua senha: ");
                String senhaDigitada = input.next();
                questao2.setSenha(senhaDigitada);
                questao2.verificarSenhaForte();
                System.out.println("");
            break;
                
            case 3:
                //QUESTÃO_03:
                System.out.println("");
                System.out.println("QUESTÃO_03:");
                EncontarQuantidadeDeAnagramas questao3 = new EncontarQuantidadeDeAnagramas();
                System.out.println("Digite um texto: ");
                String textoDigitado = input.next();
                questao3.setTexto(textoDigitado);
                questao3.quantidadeDeAnagramas();
                System.out.println("");
            break;
                
            default:
                System.out.println("");
                System.out.println("Valor inesperado, por favor, execute novamente");
                System.out.println("");
            break;
        }

            System.out.println("");
            System.out.println("Digite de 1 a 3 para a questão desejada, escolha 4 para sair: ");
            questaoDesejada = input.nextInt();
            System.out.println("");

        } while (questaoDesejada != 4);
    }
}
