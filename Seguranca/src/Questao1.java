import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> listaalfabeto = new ArrayList<String>();
		preencher(listaalfabeto);
		ArrayList<String> listanova = new ArrayList<String>();

		System.out.println("Digite a palavra:");
		String ler = sc.nextLine().toLowerCase();
		System.out.println("Digite o número de casas descoladas");
		int d = sc.nextInt();

		if (d > 25) {
			int a = d / 26;
			for (int j = 0; j < a; j++) {

				for (int i = 0; i < 26; i++) {
					listaalfabeto.add(listaalfabeto.get(i));
				}
			}
		}

		for (int w = 0; w < ler.length(); w++) {
			String letra = ler.substring(w, w + 1);
			int indice = listaalfabeto.indexOf(letra);
			listanova.add(listaalfabeto.get(indice + d));
		}
		for (int ww = 0; ww < listanova.size(); ww++) {
			System.out.print(listanova.get(ww));
		}

	}

	public static void preencher(ArrayList<String> listaalfabeto) {
		listaalfabeto.add("a");
		listaalfabeto.add("b");
		listaalfabeto.add("c");
		listaalfabeto.add("d");
		listaalfabeto.add("e");
		listaalfabeto.add("f");
		listaalfabeto.add("g");
		listaalfabeto.add("h");
		listaalfabeto.add("i");
		listaalfabeto.add("j");
		listaalfabeto.add("k");
		listaalfabeto.add("l");
		listaalfabeto.add("m");
		listaalfabeto.add("n");
		listaalfabeto.add("o");
		listaalfabeto.add("p");
		listaalfabeto.add("q");
		listaalfabeto.add("r");
		listaalfabeto.add("s");
		listaalfabeto.add("t");
		listaalfabeto.add("u");
		listaalfabeto.add("v");
		listaalfabeto.add("w");
		listaalfabeto.add("x");
		listaalfabeto.add("y");
		listaalfabeto.add("z");
		listaalfabeto.add("a");
		listaalfabeto.add("b");
		listaalfabeto.add("c");
		listaalfabeto.add("d");
		listaalfabeto.add("e");
		listaalfabeto.add("f");
		listaalfabeto.add("g");
		listaalfabeto.add("h");
		listaalfabeto.add("i");
		listaalfabeto.add("j");
		listaalfabeto.add("k");
		listaalfabeto.add("l");
		listaalfabeto.add("m");
		listaalfabeto.add("n");
		listaalfabeto.add("o");
		listaalfabeto.add("p");
		listaalfabeto.add("q");
		listaalfabeto.add("r");
		listaalfabeto.add("s");
		listaalfabeto.add("t");
		listaalfabeto.add("u");
		listaalfabeto.add("v");
		listaalfabeto.add("w");
		listaalfabeto.add("x");
		listaalfabeto.add("y");
		listaalfabeto.add("z");

	}
}