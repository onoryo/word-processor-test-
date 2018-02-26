/**
 *
 */
package document;

/**
 * @author Owner
 *
 * 文書の変更の際に呼び出されるリスナのインタフェース。
 *
 * @see com.kmaebashi.xword.document.Document#addModifyListener
 */
public interface ModifyListener {
	/**
     * あるブロック要素が変更された際に呼び出される。
     *
     * @param element 変更されたブロック要素
     */
	void modified(BlockElement element);

	/**
     * あるブロック要素が分割された際に呼び出される。<br>
     * 分割が行なわれた場合は、既存のブロック要素は保持され、
     * その後ろに新たなブロック要素が追加される。
     *
     * @param element 既存のブロック要素。
     * @param newElement 分割により生成された新たなブロック要素。
     */

	void splitted(BlockElement element, BlockElement newElement);

	/**
     * あるブロック要素が削除された。
     *
     * @param element 削除されたブロック要素
     */
	void removed(BlockElement element);

}
