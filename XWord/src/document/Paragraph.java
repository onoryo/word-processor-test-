/**
 *
 */
package document;

/**
 * @author Owner
 *
 * 段落を表現するクラス。
 */
public interface Paragraph extends BlockElement {
	/**
     * この段落に含まれる文字を取得するためのイテレータを取得する。
     *
     * @return この段落に含まれる文字を順に返すイテレータ
     */
	LetterIterator getLetterIterator();

	/**
     * この段落のindex番目の文字を返す。
     *
     * @param index 取得する文字のインデックス。最初の文字はゼロ。
     * @return indexで指定された文字
     */
	Letter getAt(int index);

	/**
     * この段落の長さを返す。改行文字は含まない。
     *
     * @return この段落の長さ。
     */
	int getLength();

}
