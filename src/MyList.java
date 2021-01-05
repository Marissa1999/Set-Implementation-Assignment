/**
 * Programmer: Marissa Gonçalves
 * Due Date: September 21, 2018
 * @param <E>
 */

interface MyList<E>
{
    
    public void clear();
    public boolean isEmpty();
    public boolean contains(E object);
    public int indexOf(E object);
    public E get(int index);
    public E set(E object, int index);
    public int size();
    public void add(int index, E object);
    public E remove(int index);
      
}
