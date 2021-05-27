package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INCIAL DEL PROGRAMA*/
		img txtMensaje = new img();
		txtMensaje.Mensaje();
		
		
		/*ESTADO DEL PLOGRAMA*/
		boolean on = true;
		
		/*INCIO DEL PROGRMA*/
		do {
		
			/*SOLICITANDO UN COMANDO*/
			Scanner inputCommand = new Scanner(System.in);
			System.out.println("");
			System.out.print("~$ ");
			String output = inputCommand.nextLine();
			
			
			/*INSTANCIAS DE CLASES*/
			CommandList dateCommand = new CommandList();
			ArithmeticFunctions fa = new ArithmeticFunctions();
			Help help = new Help();
			
			
			if(output.equals(dateCommand.command[0])) {
				fa.sumar();
			}else if (output.equals(dateCommand.command[1])) {
				fa.restar();
			}else if (output.equals(dateCommand.command[2])) {
				fa.multiplicar();
			}else if (output.equals(dateCommand.command[3])) {
				fa.division();
			}else if (output.equals(dateCommand.command[4])) {
				fa.residuo();
			}else if (output.equals(dateCommand.command[5])) {
				help.CommandList();
			}else if (output.equals(dateCommand.command[6])) {
				on = false;
			}
			
			else {
				System.out.println("Comando no encontrado");
				System.out.println("Ingresa help para más información");
			}
		}while(on);
		
		
		
		System.out.println("Programa finalizado");
		
		
	}}