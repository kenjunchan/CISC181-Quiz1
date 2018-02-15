import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Name?");
		String name = sc.nextLine();
		System.out.println("Player Hits?");
		int hits = sc.nextInt();
		System.out.println("Player At Bats?");
		int atBats = sc.nextInt();
		System.out.println("Player Walks?");
		int walks = sc.nextInt();
		System.out.println("Player Hits by Pitch?");
		int hitsbypitch = sc.nextInt();
		System.out.println("Player Sacrifice Flys?");
		int sacflies = sc.nextInt();
		System.out.println("Player Doubles?");
		int doubles = sc.nextInt();
		System.out.println("Player Triples?");
		int triples = sc.nextInt();
		System.out.println("Player Homeruns?");
		int hr = sc.nextInt();
		
		BaseballPlayer babeRuth = new BaseballPlayer(hits,atBats,walks,hitsbypitch,sacflies,doubles,triples,hr);
		
		//BaseballPlayer babeRuth = new BaseballPlayer(2873, 8399, 2062, 43, 0, 506, 136, 714);
		System.out.println("The Stats for " + name);
		System.out.println("Hits: " + hits + " At Bats: " + atBats + " Walks: " + walks + " Hits by Pitch: " + hitsbypitch + " Sacrifice Flies: " + sacflies + " Doubles: " + doubles + " Triples: " + triples + " Homeruns: " + hr);
		System.out.println("Batting Average: " + babeRuth.getBA() + " OBP: " + babeRuth.getOBP() + " SLG: " + babeRuth.getSLG() + " OPS: " + babeRuth.getOPS() + " TB: " + babeRuth.getTB());
		
	}

}
