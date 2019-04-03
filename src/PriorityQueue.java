/*Codigo obtenido de Canvas*/

/**
 * Interfaz PriorityQueue.
 * @param <E> tipo de dato generico.
 */
public interface PriorityQueue<E extends Comparable<E>> {
    /**
     * getFirst.
     * @return
     */
    public E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue

    /**
     * remove
     * @return
     */
    public E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    /**
     * add
     * @param value
     */
    public void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue

    /**
     * isEmpty.
     * @return
     */
    public boolean isEmpty();
    // post: returns true iff no elements are in queue

    /**
     * size
     * @return
     */
    public int size();
    // post: returns number of elements within queue

    /**
     * clear
     */
    public void clear();
    // post: removes all elements from queue
}
