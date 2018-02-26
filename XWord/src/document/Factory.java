/**
 *
 */
package document;

/**
 * @author Owner
 *
 * documentパッケージの各種クラスのインスタンスを生成するFactoryクラス。
 */
public class Factory {
	/**
     * Documentのインスタンスを生成する。
     *
     * @return 生成したDocumentのインスタンス。
     */
	public static Document createDocument(){

		return new DocumentImpl();

	}

	/**
     * あらかじめ文書を含んだ状態で、Documentのインスタンスを生成する。<br>
     * テスト用。
     *
     * @return 生成したDocumentのインスタンス。
     */
	public static Document createDocument(Paragraph[] paragraphs){

		return new DocumentImpl(paragraphs);

	}

	/**
     * Paragraphのインスタンスを生成する。
     * テスト用。
     *
     * @return 生成したParagraphのインスタンス。
     */
	public static Paragraph createParagraph(Letter[] letters){

		return new ParagraphImpl(letters);

	}

	/**
     * Letterのインスタンスを文字から生成する。
     *
     * @param letter 文字
     * @return 生成したLetterのインスタンス。
     */
	public static Letter createLetter(char letter){

		return new LetterImpl(letter);
	}

}
