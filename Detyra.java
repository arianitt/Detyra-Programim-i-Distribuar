

import java.util.Scanner;

public class Detyra {

	public static void main(String args[]) {
		String[] c = new String[40];
		c[0] = "Sa eshte rrenja katrore e numrit 9?";
		c[1] = "Cili eshte kryeqyteti i Holandes?";
		c[2] = "Cila klas mund te kete qasje ne te gjitha metodat publike dhe te mbrojtura?  ";
		c[3] = "Field mund te i qasemi nga e njejta klas te ciles i takon";
		c[4] = "Ne java sa bit merr floati ne memorie?";
		c[5] = "Si do te jet output-i i kesaj pjese kodi: public class operatorExample{pubilc static void main(String args[]){ int x=4;"
				+ "System.out.println(x++);}}";
		c[6] = "A munden variablat te perdoren ne Java pa i inicializuar?";
		c[7] = "A mundet nje klas ne java te trashegohet nga me shum se nje klas?";
		c[8] = "Cka do te jete output-i i Round(3.7)";
		c[9] = "A e perkrah java goto-n";
		c[10] = "Ne java nje dead thread a mundet te filloj perseri?";
		c[11] = "A kerkohet JDK ne cdo gjenerues per te startuar nje Java program?";
		c[12] = "Cila vegel kerkohet ne cdo gjenerues per te startuar nje Java program?";
		c[13] = "A eshte e mundur te definojme nje metod ne klas te Java's por te sigurojme implementimin ne kod te nje gjuhe tjeter si psh C?";
		c[14] = "A mundet nje variabel te jete lokale dhe statike ne te njejten kohe ?";
		c[15] = "Cila metod e Runnable interface duhet te implementohet nga te gjith threads'at? ";
		c[16] = "A mund te krahasojme string me stringBuffer ne Java?";
		c[17] = "A mund te hedhim ndonje tip ne boolean me ane te tipeve te hedhjeve (casting)";
		c[18] = "Klasa baze per te gjitha perjashtimet?";
		c[19] = "Variabla mjedisore qe ruan lokacionin e bin folderit ?";
		c[20] = "3";
		c[21] = "Amsterdami";
		c[22] = "sub-class";
		c[23] = "private";
		c[24] = "4";
		c[25] = "output=4";
		c[26] = "Jo";
		c[27] = "JO";
		c[28] = "3";
		c[29] = "JO";
		c[30] = "Jo";
		c[31] = "Jo";
		c[32] = "JRE";
		c[33] = "PO";
		c[34] = "Jo";
		c[35] = "Run()";
		c[36] = "Jo";
		c[37] = "Jo";
		c[38] = "Java.Lang.throwable";
		c[39] = "PATH";

		for (int i = 0; i < 20; i++) {
			String a[] = new String[20];
			Scanner in = new Scanner(System.in);
			System.out.println(c[i]);

			a[i] = in.nextLine();

			if (a[i].equals(c[i + 20]))
				System.out.println("E sakte");
			else {
				System.out.println("E pasakte -Rishqyrto");
				a[i] = in.nextLine();
			}
			}
		}
	}
