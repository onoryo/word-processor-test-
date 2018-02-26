package document;

import java.awt.Cursor;

/**
 * @author Owner
 *
 * 文書全体の情報を保持するクラス
 */

public interface Document {
	/**
	 * 文書の付属情報を返す。
	 *
	 * @return 文書の付属情報
	 */
	Attribute getAttribute();

	/**
	 * この文書に対応付けられた、新しいカーソルを作成して返す。
	 *
	 * @return 新しいカーソル
	 */
	Cursor createCursor();

	/**
	 * ブロック要素のコレクションを返す。
	 *
	 * @return ブロック要素のコレクション
	 */
	BlockElementList getBlockElementList();

	/**
	 * 文書の更新を告知するリスナを設定する。
	 *
	 * @param listener
	 */
	void addModifyListener(ModifyListener listener);

}
