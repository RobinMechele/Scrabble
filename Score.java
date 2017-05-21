package anagramGenerator;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Score {
	private ArrayDeque<String> woordenlijst = new ArrayDeque<String>(354999);
	private Scanner scanner;
	/*
	 * Constructor, die ook het woordenlijst maakt uit het tekstbestand die gebruikt wordt in de methode zoeken().
	 */
	public Score(){
		try{
			scanner = new Scanner(new File("C:\\Users\\eigenaar\\Desktop\\Java projecten\\ScrabbleSolver\\src\\anagramGenerator\\words.txt"));
			while (scanner.hasNextLine()){
				woordenlijst.add(scanner.nextLine());
			}
		} catch (Exception e){
			
		}
		scanner.close();
	}
	
	/*
	 * Methode die gebruikt word om het woord uit het woordenlijst te vergelijken met de gevormde permutaties.
	 * Indien dit gelijk is, dan wordt de score opgeteld van het gecreëerde woord en wordt deze waarde gereturned.
	 */
	public String zoeken(String woord){
		for(String lijstwoord : woordenlijst){
			if(woord.equals(lijstwoord)){
				Integer resultaat = 0;
				StringBuffer characters = new StringBuffer(woord);
				for(int i = 0; i < characters.length(); i++){
					char letter = characters.charAt(i);
					if(letter == 'z'|| letter == 'q'){
						resultaat += 10;
					}
					if(letter == 'j'|| letter == 'x'){
						resultaat += 8;
					}
					if(letter == 'k'){
						resultaat += 5;
					}
					if(letter == 'f'|| letter == 'h'|| letter == 'v'|| letter == 'w'|| letter == 'y'){
						resultaat += 4;
					}
					if(letter == 'b'|| letter == 'c'|| letter == 'm'|| letter == 'p'){
						resultaat += 3;
					}
					if(letter == 'd'|| letter == 'g'){
						resultaat += 2;
					}
					if(letter == 'a'|| letter == 'e'|| letter == 'i'|| letter == 'l'|| letter == 'n'
							|| letter == 'o'|| letter == 'r'|| letter == 's'|| letter == 't'|| letter == 'u'){
						resultaat += 1;
					}
				}
				return resultaat.toString();
			}
		}
		return "0";
	}
}