import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> decodificando = new ArrayList<String>();
		String v[][] = new String[6][6];
		preencher(v);

		System.out.println("digite os números:");
		String a = sc.nextLine();
		ArrayList<Integer> geral = new ArrayList<Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		// colocando o string lido em uma lista geral
		for (int i = 0; i < a.length(); i++) {
			String letras = a.substring(i, i + 1);
			int convertido = Integer.parseInt(letras);
			geral.add(convertido);
		}
		// separando os valores lidos em duas listas:
		for (int j = 0; j < a.length(); j++) {
			if (j % 2 == 0) {
				x.add((geral.get(j)));
			} else {
				y.add((geral.get(j)));
			}
		}

		// as listas já estão separadas, agora vamos decodificar os números
		for (int m = 0; m < y.size(); m++) {
			int c = x.get(m);
			int d = y.get(m);
			decodificando.add((v[c][d]));
		}
		// imprimindo lista de letras
		for (int ii = 0; ii < decodificando.size(); ii++) {
			System.out.print(decodificando.get(ii));
		}

	}

	public static void preencher(String v[][]) {
		v[0][0] = " ";
		v[0][1] = " ";
		v[0][2] = " ";
		v[0][3] = " ";
		v[0][4] = " ";
		v[0][5] = " ";
		v[1][0] = " ";
		v[2][0] = " ";
		v[3][0] = " ";
		v[4][0] = " ";
		v[5][0] = " ";

		v[1][1] = "a";
		v[1][2] = "b";
		v[1][3] = "c";
		v[1][4] = "d";
		v[1][5] = "e";
		v[2][1] = "f";
		v[2][2] = "g";
		v[2][3] = "h";
		v[2][4] = "i";
		v[2][5] = "j";
		v[3][1] = "k/q";
		v[3][2] = "l";
		v[3][3] = "m";
		v[3][4] = "n";
		v[3][5] = "o";
		v[4][1] = "p";
		v[4][2] = "r";
		v[4][3] = "s";
		v[4][4] = "t";
		v[4][5] = "u";
		v[5][1] = "v";
		v[5][2] = "w";
		v[5][3] = "x";
		v[5][4] = "y";
		v[5][5] = "z";

	}
}