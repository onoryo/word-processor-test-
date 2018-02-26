package documentimpl;

import java.awt.Cursor;
import java.util.ArrayList;

import document.Attribute;
import document.BlockElement;
import document.BlockElementList;
import document.Document;
import document.ModifyListener;


public class DocumentImpl implements Document {

	private AttributeImpl attribute;
	private BlockElementList blockElementList;
	private ArrayList modifyListener = new ArrayList();

	public DocumentImpl(){

		this.attribute = new AttributeImpl();
		this.blockElementList = new BlockElementListImpl();

	}

	// テスト用
	public DocumentImpl(paragraph[] paragraphs){

		this();
		this.blockElementList = new BlockElementListImpl(paragraphs);
	}

	@Override
	public Attribute getAttribute() {
		// TODO 自動生成されたメソッド・スタブ
		return this.attribute;
	}

	@Override
	public Cursor createCursor() {
		// TODO 自動生成されたメソッド・スタブ
		return new CursorImpl(this);
	}

	@Override
	public BlockElementList getBlockElementList() {
		// TODO 自動生成されたメソッド・スタブ
		return this.blockElementList;
	}

	@Override
	public void addModifyListener(ModifyListener listener) {
		// TODO 自動生成されたメソッド・スタブ
		this.modifyListener.add(listener);

	}

	void notifyModified(BlockElement element){

		for(int i = 0; i < this.modifyListener.size(); i++){

			ModifyListener listener = (ModifyListener) this.modifyListener.get(i);
			listener.modified(element);

		}
	}

	void notifySplitted(BlockElement element, BlockElement newElement){

		for(int i = 0; i < this.modifyListener.size(); i++){

			ModifyListener listener = (ModifyListener) this.modifyListener.get(i);
			listener.splitted(element, newElement);
		}
	}

	void notifyRemoved(BlockElement element){

		for(int i = 0; i < this.modifyListener.size(); i++){

			ModifyListener listener = (ModifyListener) this.modifyListener.get(i);
			listener.removed(element);
		}
	}

}
