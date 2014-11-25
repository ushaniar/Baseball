/**
 * This class represents a game between two teams.
 * 
 * @author aushani
 *
 */

public class Game {

	Team homeTeam;
	Team awayTeam;
	
	@Override
	public String toString() {
		return awayTeam.toString() + "vs." + homeTeam.toString();
	}
	
}
