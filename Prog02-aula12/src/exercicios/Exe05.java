package exercicios;

public class Exe05 {
/*Escreva um programa em Java composto por duas threads: 
 * a primeira deve contar e exibir na tela todos os números entre 1 e 500 (de forma crescente); 
 * a segunda deve contar e exibir na tela todos os números entre 500 e 1 (de forma decrescente). 
 * As duas threads devem ser executadas em paralelo.
*/
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 500; i++) {
					System.out.println("Crescente --> " + i);
				}				
			}
		});
		
		//Expressão lambda, A PARTIR DO JAVA 8
		
		Thread t2 = new Thread(() -> {
            for(int i = 500; i >=0; i--) {
                System.out.println("Decrescente --> " + i);
            }
        });
		
		t1.start();
		t2.start();
	}
	
}
