package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController opSistema = new RedesController();
		String os = opSistema.Sistema();
		Scanner input = new Scanner(System.in);
		Scanner par = new Scanner(System.in);
		String w = "Windows";
		String l = "Linux";
		String ar[] = new String[3];
		ar = os.split(" ");
		String b = ar[0];
		String process = "ipconfig";
		String processl = "ifconfig";
		System.out.println(os);
		int n = 0 ;
		while (n != 9) {
			System.out.print("\n Desculpa Prof. Só conseguir fazer só até essa parte só funciona no Linux.\n  \n\n1 - Mostrar Sistema Operacional \n2 - Mostrar IPV4 e Adaptadores \n9 - Finaliza\n\n" );
			int j = input.nextInt();
			n = j ;
			switch(j) {
			case 1:
				System.out.println("Sistema operacional é o " + os);
				break;
			case 2:	
				opSistema.Processos(w, b ,l, process,processl);
				break;			
			case 9:
				System.out.println("Fechando programa");
			}		
		}					
	}
}
