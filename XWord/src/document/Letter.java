package document;

/**
 *
 * @author Owner
 *
 * 文書中の「文字」を表現するクラス。
 */

public interface Letter {
	/**
     * この<code>Letter</code>に含まれている文字を、char型で返す。
     *
     * @return このLetterに含まれる文字。
     */
	char getCharacter();

	/**
     * この<code>Letter</code>に含まれている文字を、String型で返す。
     *
     * @return このLetterに含まれる文字。
     */
	String toString();

}
