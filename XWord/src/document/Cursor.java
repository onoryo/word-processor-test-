package document;

import javax.swing.text.html.HTMLDocument.BlockElement;

/**
 * @author Owner
 *
 *カーソルを表現するクラス。<br>
 *文書の更新作業は、すべてここから行う。
 */
public interface Cursor {
	/**
	 * カーソルの移動に成功した。
	 */
	final int MOVED = 0;

	/**
	 * すでに端にいるなどで、カーソルが動かなかった。
	 */
	final int CAN_NOT_MOVE = 1;

	/**
	 * 現在のカーソル位置に文字を挿入する。
	 *
	 * @param letter 挿入する文字
	 */
	void insert(Letter letter);

	/**
	 * 改行を挿入する。
	 */
	void lineBreak();

	/**
	 * 現在のカーソル位置の直前の文字を削除する。
	 */
	void backSpace();

	/**
	 * カーソルを上に移動する。
	 *
	 * @return 移動できた場合、Cursor.MOVED、カーソルがすでに一番上にあり、
	 * 移動できなければCursor.CAN_NOT_MOVE。
	 */
	int moveUp();

	/**
	 * カーソルを左に移動する。
	 * カーソルがすでに左端にある場合には、さらに上の行に移動する。
	 *
	 * @return 移動できた場合、Cursor.MOVED、カーソルがすでに文章の先頭にあり、
	 * 移動できなければCursor.CAN_NOT_MOVE。
	 */
	int moveLeft();

	/**
	 * カーソルを右に移動する。
	 *
	 * @return 移動できた場合、Cursor.MOVED、カーソルがすでに文章の末尾にあり、
	 * 移動できなければCursor.CAN_NOT_MOVE。
	 */
	int moveRight();

	/**
	 * カーソルを下に移動する。
	 *
	 * @return 移動できた場合、Cursor.MOVED、カーソルがすでに一番下にあり、
	 * 移動できなければCursor.CAN_NOT_MOVE。
	 */
	int moveDown();

	/**
     * 現在カーソルが存在する<code>BlockElement</code>を返す。
     *
     * @return 現在カーソルが存在する<code>BlockElement</code>
     */
	BlockElement getCurrentBlockElement();

	/**
     * カーソル位置取得オブジェクトを設定する。
     *
     * @param getter カーソル位置取得オブジェクト
     * @see com.kmaebashi.xword.document.CursorPositionGetter
     */
	void setCursorPositionGetter(CursorPositionGetter getter);

	/**
     * 現在のカーソルの位置を返す。
     *
     * @return 現在のカーソルの位置
     */
	CursorPosition getCursorPosition();

}




















