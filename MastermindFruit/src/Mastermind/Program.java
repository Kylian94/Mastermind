

package Mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
	
	private static Scanner sc;
	private static int BP = 0;
	private static int E = 0;
	
	
	public static void main(String[] args) {
		
		Fraise _fraise = new Fraise("fraise");
		Prune _prune = new Prune("prune");
		Kiwi _kiwi = new Kiwi("kiwi");
		Citron _citron = new Citron("citron");
		Framboise _framboise = new Framboise("framboise");
		Raisin _raisin = new Raisin("raisin");
		Banane _banane = new Banane("banane");
		Orange _orange = new Orange("orange");
		
		Object[] allFruits = {_fraise, _prune, _kiwi, _citron, _framboise, _raisin, _banane, _orange };
		
		//System.out.println(((Fraise) allFruits[0]).getName());
		
		// int code = (int)(Math.random() * ((7 - 0) + 1)) + 0;
		
		// System.out.print(code);
		
		//Object[] fruits;
		List<Fruits> fruits = new ArrayList<Fruits>();
		
		for(int i=0; i<4; i++) {
			
			int code = (int)(Math.random() * ((7 - 0) + 1)) + 0;
			fruits.add((Fruits) allFruits[code]);
			//System.out.print(((List<Fruits>) fruits).get(i).name + " ");
			//System.out.print(((List<Fruits>) fruits).get(i).withSeed + "-");
		
		}
		int nbPoint = 0;
		int guess = 10;
		System.out.println(" ");
		System.out.println("*-----------------------------*");
		System.out.println("*-----------------------------*");
		System.out.println("*- Mastermind version Fruité -*");
		System.out.println("*-----------------------------*");
		System.out.println("*-----------------------------*");
		System.out.println(" ");
		System.out.println("L'ordinateur a choisi aléatoirement 4 fruits parmis une liste ");
		System.out.println("de 8 fruits, arriverez vous à les retrouver ?");
		System.out.println(" ");
		System.out.println("Listes des fruits : ");
		System.out.println("fraise, banane, prune, orange, raisin, citron et kiwi.");
		System.out.println(" ");
		System.out.println("Vous avez 10 essais.");
		
		while(guess > 0) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("Veuillez deviner les fruit : (donner 4 fruits)");
	        String str = sc.nextLine();
	        
	        //System.out.println(str.length());
	        
	        
	        	str = str.replaceAll(" ", "-");
		        
		        //System.out.println(str);
		        
		        String[] userGuess = str.split("-");
		        
		        //System.out.println(userGuess.length);
		        
		        if(userGuess.length != 4) {
		        	System.out.println(" ");
		        	System.out.println("Veuillez rentrer 4 fruits");
		        } else {
		        
		        
				for(int i = 0; i < 4; i++)
				{
				  for (int j = 0; j < 4; j++)
				  {
				    if (userGuess[i].equals(fruits.get(j).name))
		    		{
				      if(i == j) {
				    	  BP += 1;
				      } else {
				    	  E += 1;
				      }
				    }
				    
				  }
				  
				}
				System.out.println(" ");
				System.out.println("Bien placé : " + BP);
				System.out.println("Existe : " + E);
				guess--;
				System.out.println(" ");
				System.out.println("Il vous reste : "+ guess + " chances/10");
				
				
				if(guess == 8) {
					Scanner indice1 = new Scanner(System.in);
					System.out.println(" ");
					System.out.println("Voulez vous un indice contre 2 essaie ? press y or n");
					
					if(indice1.nextLine().contentEquals("y")) {
						System.out.println("Est ce que le fruit a des pépins ?");
						System.out.println(" ");
						for(int i = 0; i < 4; i++)
						{
							String trad = ((List<Fruits>) fruits).get(i).withSeed.toString();
							if (trad.contentEquals("false")) {
								System.out.print("Sans pépins - ");
							} else {
								System.out.print("Avec pépins - ");
							}
							
						}
						guess = guess-2;
					}
				}
				if(guess == 4) {
					Scanner indice2 = new Scanner(System.in);
					System.out.println(" ");
					System.out.println("Voulez vous un deuxieme indice contre 3 essaie ? press y or n");
					
					if(indice2.nextLine().contentEquals("y")) {
						System.out.println("Est ce que le fruit a une peau qui se mange ?");
						System.out.println(" ");
						for(int i = 0; i < 4; i++)
						{
							String trad = ((List<Fruits>) fruits).get(i).isPeelable.toString();
							if (trad.contentEquals("false")) {
								System.out.print("Se mange - ");
							} else {
								System.out.print("Se mange pas - ");
							}
						}
						guess = guess-3;
					}
				}
				
				
				if(BP == 4) {
					nbPoint += guess;
					System.out.println(" ");
					System.out.print("Gagné !!!! vous avez obtenu " + nbPoint +" points!");
					break;
				}
				E = 0;
				BP = 0;
	        }
	        
	        
		}
		
		if(guess == 0) {
			System.out.println("Vous avez perdu !");
			System.out.println(" ");
			System.out.println("Voici les fruits qui fallait deviner : ");
			System.out.println(" ");
			for(int i=0; i<4; i++) {
				int nb = i + 1; 
			System.out.println("Le fruit n° " + nb + " " +((List<Fruits>) fruits).get(i).attr + " ");
			}
			
		}
		
	}

}
