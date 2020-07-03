import java.util.HashMap;
import java.util.Set;

public class Tracklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Numb", "I've become so numb, I can't feel you there\r" + 
				"Become so tired, so much more aware\r");
		trackList.put("Faint", "I can't feel the way I did before\r" + 
				"Don't turn your back on me\r" );
		trackList.put("Somewhere i belong", "I want to heal, I want to feel,\r" + 
				"What I thought was never real...\r");
		trackList.put("Crawling", "Crawling in my skin\r" + 
				"These wounds, they will not heal..\r");

		Set<String> letra= trackList.keySet();
		for(String cancion: letra) {
			System.out.println("Nombre de la cancion: "+cancion+"\nLetra: "+trackList.get(cancion));
		}

	}
	

}
