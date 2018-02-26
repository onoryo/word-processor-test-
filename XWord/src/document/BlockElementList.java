/**
 *
 */
package document;

/**
 * @author Owner
 *
 * <code>BlockElement</code>を管理するコレクションクラス。
 */
public interface BlockElementList {
	 /**
     * 全ての要素を削除する。
     */
	void clear();

	/**
	 * イテレータを取得する。
	 * @return BlockElementのイテレータ
	 */
	BlockElementIterator getIterator();

}
