package scl.edu.gt;

public class CommandList {
	
	String command 		[] = new String [12];
	String information 	[] = new String [12];
	
	int cantidadDeComandos;
	
	CommandList() {
		
		command[0]= "suma";
		command[1]= "resta";
		command[2]= "multiplicacion";
		command[3]= "division";
		command[4]= "residuo";
		command[5]= "help";
		command[6]= "exit";
		command[7]= "kernel";
		command[8]= "CPU";
		command[9]= "Targeta_grafica";
		command[10]= "disco_duro";
		command[11]= "procesador";
		
		
		information[0]= "		El comando puede realzar la suma de dos  \n		números ya sean enteres o decimales, el valor \n		a retornar es un doublé.";
		information[1]= "       El comando puede realzar la resta de dos \n		números ya sean enteres o decimales, el valor \n		a retornar es un doublé.";
		information[2]= "       El comando puede realzar la multiplicacion de dos \n	    números ya sean enteres o decimales, el valor \n	a retornar es un doublé.";
		information[3]= "       El comando puede realizar la divicion de dos \n numeros enteros con un double";
		information[4]= "       Es el resultante de la operacion";
		information[5]= "       Es la ayuda que necesita si tiene alguna \n duda con una variable";
		information[6]= "       Es para salir del programa";
		information[7]= "       es un software que constituye una parte fundamental \n   del sistema operativo, y se define como la parte \n que se ejecuta en modo privilegiado \n (conocido también como modo núcleo";
		information[8]= "       Sigla de la expresión inglesa central processing unit, \n 'unidad central de proceso', que es la parte de una \n computadora en la que se encuentran \n los elementos que sirven para procesar datos";
		information[9]= "       es una tarjeta de expansión de la placa base del ordenador \n que se encarga de procesar los datos provenientes \n de la unidad central";
		information[10]= "      es una unidad de hardware que se usa para almacenar contenido \n y datos digitales en las computadoras";
		information[11]= "      puede referirse a los siguientes artículos: Hardware. Unidad central \n de procesamiento (CPU) interpreta las instrucciones \ny procesa los datos de los \nprogramas de computadora";
		
	}
}