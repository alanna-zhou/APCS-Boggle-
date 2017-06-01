import java.util.SortedSet;

/**
 * Augments <code>AutoPlayer</code> by adding abstract method for autoplayer.
 * 
 * @author Owen Astrachan
 *
 */
public abstract class AbstractAutoPlayer extends AbstractPlayer implements IAutoPlayer {

	/**
	 * Requires that an auto player be able to find all the possible words on a
	 * boggle board.
	 * 
	 * @param board
	 * @param lex
	 * @param minLength
	 */
	public abstract void findAllValidWords(BoggleBoard board, ILexicon lex, int minLength);

	/**
	 * Return string "AutoPlayer".
	 * 
	 * @return this player's name
	 */
	public String getName() {
		return "AutoPlayer";
	}
}
