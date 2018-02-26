/**
 *
 */
package document;

/**
 * @author Owner
 *
 * カーソルが上下方向へ移動した際、その移動後の位置を返すインタフェース。<br>
 * documentパッケージでは現在のレイアウトを管理していないため、
 * カーソルの上下方向の移動に関しては移動後の位置がわからない。
 * そのため、このインタフェースを、レイアウト情報を保持している側の
 * プログラムで実装し、<code>Cursor</code>の
 * <code>setCursorPositionGetter()</code>でセットする。
 */
public interface CursorPositionGetter {
	/**
     * 上方向へ移動した後の位置を返す。
     * 移動できなかったらnullを返す。
     *
     * @param currentPosition 現在の位置
     * @return 移動後の位置
     */
	CursorPosition getUpPosition(CursorPosition currentPosition);

	/**
     * 下方向へ移動した後の位置を返す。
     * 移動できなかったらnullを返す。
     *
     * @param currentPosition 現在の位置
     * @return 移動後の位置
     */
	CursorPosition getDownPosition(CursorPosition currentPosition);

}
