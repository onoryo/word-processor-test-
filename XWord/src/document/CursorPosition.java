/**
 *
 */
package document;

/**
 * @author Owner
 *
 * カーソル位置を表現するクラス。
 */
public class CursorPosition {

	private BlockElement blockElement;
	private int position;

	/**
	 * <code>CursorPosition</code>を生成する。
	 */
	public CursorPosition(BlockElement blockElement, int position){

		this.blockElement = blockElement;
		this.position = position;

	}

	/**
	 * カーソルが存在するブロック要素を返す。
	 *
	 * @return カーソルが存在するブロック要素。
	 */
	public BlockElement getBlockElement(){

		return this.blockElement;
	}

	/**
	 * ブロック要素の中での位置を返す。<br>
	 * カーソルが、先頭の文字の前に位置するとき、ゼロを返す。
	 *
	 * @return ブロック要素の中でのカーソル位置。
	 */
	public int getPosition(){

		return this.position;
	}

}
