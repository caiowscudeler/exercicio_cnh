import java.util.Scanner;
class HelloWorld {
       public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
		// Inicializar um Scanner
		int n, n1, n2;
		// Inicializar variaveis 
		System.out.printf("Voce foi aprovado no exame psicotecnico? Digite 1 para sim e 0 para nao!\n");
		// Texto que aparecera para o usuario
		n = ler.nextInt();
		// Associar variavel ao Scanner e ao texto
		if (n == 0) {
			// comando caso n forem igual a 0 
			System.out.printf("Voce nao esta apto a ter habilitacao!");
		// Texto que aparecera para o usuario	
		} else if (n == 1) {
			// outra condicao para n, se for igual a 1
			System.out.printf("Voce foi aprovado no exame de legislacao? Digite 1 para sim e 0 para nao!\n");
			// Texto que aparecera para o usuario	
			n1 = ler.nextInt();
			//Associar variavel ao Scanner e ao texto
            
			if (n1 == 0) {
		// comando caso n1 forem igual a 0 
				System.out.printf("Voce nao esta apto a ter habilitacao!");
					// Texto que aparecera para o usuario	
		
			} else {
			    //comando caso a condicao seja falsa
				
				System.out.printf("Voce foi aprovado no exame de direcao? Digite 1 para sim e 0 para nao!\n");
				// Texto que aparecera para o usuario
			
				n2 = ler.nextInt();
			//Associar variavel ao Scanner e ao texto
			
				if (n2 == 0) {
				// comando caso n forem igual a 0 
					System.out.printf("Voce nas esta apto a ter habilitacao!");
					// Texto que aparecera para o usuario
					
			
				} else {
				       //comando caso a condicao seja falsa
				
					System.out.println("Voce esta apto para tirar hablitacao");
					// Texto que aparecera para o usuario
				}
			}
		}

	}
}
