import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		// Scanner � usado para lermos os dados que o usu�rio digitar pelo teclado
		Scanner leitor = new Scanner(System.in);
		// a linha abaixo cria uma variavel (espa�o na memoria) para guardarmos um dado. 
		//Nesse caso, o nome do usuario.
		String nomeUsuario;
		
        System.out.println("Por favor, escreva seu nome:");
        
        // a linha abaixo l� o texto que o usu�rio escrever no seu teclado
        nomeUsuario = leitor.next();
        
       // A linha abaixo exibe o conteudo da variavel. 
        //Ela faz isso ao exibir um texto e junta-lo a variavel.
        System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
        
        //Sempre precisamos liberar o scanner apos o uso
        leitor.close();
        
        
	}

}
