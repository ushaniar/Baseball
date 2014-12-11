/**
 * This class represents a Batter on a team.
 * 
 * @author ushania
 *
 */

public class Batter extends Player {
	// keep track of ball and strike
	int ball = 0;
	int strike = 0; 
	
	// did player swing
		// if yes
			// if hit 
				// find out where hit to
			// if miss
				// strike++
		// else if no
			// determine ball or strike
	
		// if strike == 3
			// out++
		// if ball == 4
			// player walks
	
		// if out == 3
			// switch teams
	
	boolean isFoul() {
		// if ball is foul
			// return true
		return false;
	}
}
