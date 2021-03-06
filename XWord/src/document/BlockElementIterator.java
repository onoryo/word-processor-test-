/**
 *
 */
package document;

/**
 * @author Owner
 *
 * <code>BlockElementList</code>のイテレータ。<br>
 *
 * @see java.util.Iterator
 */
public interface BlockElementIterator {
	/**
	 * 現在位置の後ろにさらに要素がある場合、trueを返す。
	 * @return next()が実行できるかどうか。
	 */
	boolean hasNext();

	/**
     * 現在位置の前にさらに要素がある場合、trueを返す。
     * @return previous()が実行できるかどうか。
     */
	boolean hasPrevious();

	/**
     * 現在位置の後ろの要素を返す。イテレータはひとつ進む。
     * @return 現在位置の後ろの要素。
     */
	BlockElement next();

	/**
     * 現在位置の後ろの要素を返す。イテレータはひとつ戻る。
     * @return 現在位置の前の要素。
     */
	BlockElement previous();

}
