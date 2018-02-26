package documentimpl;

import java.util.ListIterator;

import document.BlockElement;
import document.BlockElementIterator;

public class BlockElementIteratorImpl implements BlockElementIterator {

	private ListIterator iterator;

	BlockElementIteratorImpl(ListIterator iterator){
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		// TODO 自動生成されたメソッド・スタブ
		return this.iterator.hasNext();
	}

	@Override
	public boolean hasPrevious() {
		// TODO 自動生成されたメソッド・スタブ
		return this.iterator.hasPrevious();
	}

	@Override
	public BlockElement next() {
		// TODO 自動生成されたメソッド・スタブ
		return (BlockElement) this.iterator.next();
	}

	@Override
	public BlockElement previous() {
		// TODO 自動生成されたメソッド・スタブ
		return (BlockElement) this.iterator.previous();
	}

	void add(BlockElement newElement){

		this.iterator.add(newElement);

	}

}
