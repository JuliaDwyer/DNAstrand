import java.util.Arrays;
import java.util.Scanner;

public class DnaStrand {

	public static void main(String[] args) {
		System.out.println("Please enter a nucleotide sequence.");
		Scanner nucleotide = new Scanner(System.in);
		String input = nucleotide.nextLine();
		String[] sequence = input.split("");
		String[] dnaStrand = new String[sequence.length];

		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i].equals("A")) {
				dnaStrand[i] = "T";
			} else if (sequence[i].equals("T")) {
				dnaStrand[i] = "A";
			} else if (sequence[i].equals("G")) {
				dnaStrand[i] = "C";
			} else if (sequence[i].equals("C")) {
				dnaStrand[i] = "G";
			} else {
				System.out.println("A mutation has occured.");
			}
		}
		System.out.println(Arrays.toString(dnaStrand));

	}

}
