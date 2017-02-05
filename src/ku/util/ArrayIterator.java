package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayIterator is a class that let us iterate over all the element in array.
 * @author Non Puthikanon
 *
 * @param <T> is a type of an array.
 */
public class ArrayIterator<T> implements Iterator<T> {
	private T[] array;
	private int cursor;
	private boolean exist;

	/**
	 * Constructor of an ArrayIterator with an array you want to work through.
	 * @param array is the array to iterate over.
	 */
	public ArrayIterator(T[] array) {
		this.array = array;
		this.exist = false;

	}
	
	/**
	 * Check if there is any non-null element in the array.
	 * 
	 * @return true if there is next non-null element.
	 *         false if there is none left.
	 */
	@Override
	public boolean hasNext() {
		for (int i = this.cursor; i < this.array.length; i++) {
			if (this.array[i] != null) {
				this.cursor = i;
				return true;
			}
		}

		return false;
	}
	
	/**
	 * Return the next non-null element from array.
	 * If there are no more elements, it throws NoSuchElementException.
	 * 
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException
	 *             if there are no more elements.
	 */
	@Override
	public T next() {
		if (this.hasNext()==true) {
			T nextElement = array[cursor];
			this.cursor += 1;
			this.exist = true;
			return nextElement;
		}

		else {
			throw new NoSuchElementException();
		}

	}

	/**
	 * Remove most recent element returned by next() from the array by setting it to null.
	 * 
	 * 
	 * @throws IllegalStateException If this method is called without calling next() 
	 * or called more than once after calling next().
	 */
	public void remove() {
		if (this.exist==true) {
			array[cursor - 1] = null;
			exist = false;
		}

		else {
			throw new IllegalStateException();
		}

	}

}
