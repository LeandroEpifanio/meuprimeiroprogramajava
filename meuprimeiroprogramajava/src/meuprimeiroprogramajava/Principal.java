/**
 * Meu primeiro programa java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa java é construido dentro de um projeto java.
 * 2) Todo programa java deve ter uma classe com um metodo main.
 * 3) como exibir informações no terminal (console) do java.
 * 4) como ler uma string do terminal (console) do java.
 * 
 */
package meuprimeiroprogramajava;

import java.util.Scanner;

/**
 * @author Leandro
 * data: 03/02/2021
 */
public class Principal {
	public static void main(String[] args) {
		System.out.println("Olá amigo!\nQual é o seu nome?");
	// comentario
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		System.out.printf("olá %s", nome);
		in.close();
	}

}
