package anagramGenerator;

import java.util.ArrayList;

/**
 * 
 * Represents the postion in a tree
 *
 *@param <T> element type
 */
public interface Position<T> {
	/**
	 * 
	 * @return The element at the position in the tree
	 */
	T get();
	
	/**
	 * 
	 * @return the children of the position in the tree
	 */
	ArrayList<Position<T>> children();
	
	/**
	 * 
	 * @return the parent of the position of the tree
	 */
	Position<T> parent();
}