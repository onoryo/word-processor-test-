package documentimpl;

import java.util.LinkedList;

import document.BlockElement;
import document.BlockElementIterator;
import document.BlockElementList;
import document.Paragraph;

public class BlockElementListImpl implements BlockElementList {

	private LinkedList linkedList = new LinkedList();

	BlockElementListImpl(){
		// 初期状態では、段落が1つだけ存在すると考える。
		this.linkedList.add(new ParagraphImpl());

	}

	// テスト用
	BlockElementListImpl(Paragraph[] pArray){

		for(int i = 0; i < pArray.length; i++){

			this.linkedList.add(pArray[i]);

		}
	}

	@Override
	public void clear() {
		// TODO 自動生成されたメソッド・スタブ
		this.linkedList.clear();
	}

	@Override
	public BlockElementIterator getIterator() {
		// TODO 自動生成されたメソッド・スタブ
		return new BlockElementIteratorImpl(this.linkedList.listIterator());
	}

	int indexOf(BlockElement element){

		return this.linkedList.indexOf(element);

	}

	int size(){

		return this.linkedList.size();

	}

	void add(int index, BlockElement element){

		this.linkedList.add(index, element);

	}

	BlockElement get(int index){

		return (BlockElement) this.linkedList.get(index);

	}

	void remove(int index){

		this.linkedList.remove(index);

	}

}


















