package IO;

import Types.*;
import java.io.IOException;

public class Menu {

	public static MenuCommand mainMenu() throws IOException {
		System.out.println("1 - Adicionar novo elemento.");
		System.out.println("2 - Remover elementos.");
		System.out.println("3 - Editar elementos.");
		System.out.println("4 - Imprimir elementos.\n");
		int i = Console.readCommand("\tComando") - 1;
		switch (i) {
			case 0:
				return MenuCommand.Add;
			case 1:
				return MenuCommand.Remove;
			case 2:
				return MenuCommand.Edit;
			default:
				return MenuCommand.Print;
		}

	}

}
