package tournament;

import java.util.Arrays;
import java.util.Random;



public class Tournament   {


	public static void main(String[] args) {

		String[] names = { "ver1", "ver2", "ver3", "ver4", "ver5" };
		Worm[] team1 = new Worm[5];
		for(int i = 0; i < 5; ++i) {
		 	team1[i] = new Worm(names[i]);
		}

		
		String[] names2 = { "verA", "verB", "verC", "verD", "verE" };
		Worm[] team2 = new Worm[5];
		for(int j = 0; j < 5; ++j) {
		 	team2[j] = new Worm(names2[j]);
		}
		//Worm[] team2 = new Worm[] { wormA,wormB,wormC,wormD,wormE };


		for (int i = 0; i < team1.length; i++) {
			Random rand = new Random();
			for (int j = 0; j < team2.length; j++) {

				int r = rand.nextInt(40);
				
				team2[j].setLife(r);
				r = rand.nextInt(40);
				team2[j].setAttak(r);
				//System.out.println(team2[j].toString());
				int n = rand.nextInt(40);
				team1[i].setLife(n);
				r = rand.nextInt(40);
				team1[i].setAttak(n);
				while(team1[i].getLife() > 0 && team2[j].getLife() > 0) {
					System.out.println(" le :"+team1[i].getName()+" attaque :"+team2[j].getName());
					team2[j].setLife(team2[j].getLife()- team1[i].getAttak()) ;
					team1[i].setLife(team1[i].getLife() + 20/100* team1[i].getLife()) ;
					
					if(team1[i].getLife() ==0) {
						System.out.println("le gagnant est : "+team2[j].getName());
						
					} else {
						System.out.println("le gagnant est : "+team1[j].getName());
					}
					System.out.println("Pour le"+team1[i].getName()+" lui reste "+team2[j].getLife());
				}
			}
			//System.out.println(team1[i].toString());
		}





	}

}
