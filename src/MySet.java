import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Programmer: Marissa Gonçalves
 * Due Date: September 21, 2018
 * @param <E>
 */
  

public class MySet<E> implements MyList<E>
{
    
    private Node<E> head;
    private Node<E> tail;
    private int size;

    
    
    
    
    public MySet()
    {  
        Set<E> newSet = new HashSet<>();
        newSet.isEmpty();
    }
    
    
    
    
    
    
    public MySet(E[] array)
    {
        
        this();
         
        for (E object : array)
        {
            add(object);
        }      
        
        this.size = array.length;
    }
    
    
    
    
    public MySet(List otherList)
    {
 
        this();
         
        for (int i = 0; i < otherList.size(); i++)
        {
            add((E) otherList.get(i));
        }    
        
        this.size = otherList.size();
    }
    
    
    
    
    public boolean add(E element)
    {
        
        int index = indexOf(element);

        
        if (index == -1)
        {
             if (this.tail == null)
             {
                 this.head = this.tail = new Node<>(element);
             }
        
             else
             {
                Node<E> newNode = new Node<>(element);
                this.tail.next = newNode;
                this.tail = this.tail.next;
             }
        
            this.size++;
            return true;
        }
        
        
        else
        {
           return false;
        }
            
        
    }
    
    
    
    
    
    public boolean remove(E element)
    {
        
        int index = indexOf(element);
        
        
        if (index == -1)
        {
            return false;
        }
        
        else
        {
            remove(index);
            return true;
        }
        
        
    }
    
    
    
    
    
    public MySet<E> union(MySet<E> otherSet)
    {
          
        for (int i = 0; i < otherSet.size(); i++) 
        {
            E element = otherSet.get(i);
            this.add(element);
        }
        
       
       return this;
       
    }
    
    
    
    
    
    
    public MySet<E> intersection(MySet<E> otherSet)
    {     
        
        
        MySet<E> temp = new MySet<>();
        
        for (int i = 0; i < this.size(); i++) 
        {
            E element = this.get(i);    
            temp.add(element);  
        }
        
         for (int i = 0; i < temp.size(); i++) 
         {
             E element = temp.get(i);
            
             if(!otherSet.contains(element))
             {
                this.remove(element);  
             }
             
         }
        
         return this;

         
            
    }
     
     
     
    
    
     
    public MySet<E> difference(MySet<E> otherSet)
    {
        
         for (int i = 0; i < otherSet.size(); i++) 
         {
              E element = otherSet.get(i);
              
              if (this.contains(element))
              {
                  this.remove(element);
              }
         }
         
        
         return this;
         
    }
    
    

    
    
    
    @Override
    public void clear() 
    {
        this.head = this.tail = null;
    }

    
    
    
    
    
    @Override
    public boolean isEmpty() 
    {
        return this.size == 0;
    }

    
    
    
    
    
    @Override
    public boolean contains(E object) 
    {
         return indexOf(object) != -1;
    }

    
    
    
    
    
    @Override
    public int indexOf(E object) 
    {
        
        Node<E> current = this.head;

        for (int i = 0; i < this.size; i++)
        {
            
            if (current.element.equals(object))
            {
                 return i; 
            }
            
            current = current.next;
      
        }
        
        return -1;
        
    }

    
    
    
    
    
    @Override
    public E get(int index) 
    {
        
        if ((this.size != 0) && (index <= this.size - 1))
        {
            int i = 0;
            Node<E> current = this.head;
        
            while (i < index)
            {
               current=current.next;
               i++;
            }
            
            return current.element;
        }
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
            
    }

    
    
    
    
    
    @Override
    public E set(E object, int index) 
    {
        
        if (this.contains(object))
        {
            return null;
        }
        
        
        if ((this.size != 0) && (index <= this.size - 1))
        {
           
            Node<E> current = head; 
            
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }
           
            
            E substitute = current.element;
            current.element = object;
            return substitute;
            
        }
        
        
        else
        {
            throw new IndexOutOfBoundsException();
        }
        
    }

    
    
    
    
    @Override
    public int size() 
    {    
         return this.size;   
    }

     
    
    
    
    @Override
    public void add(int index, E object)
    {
    
        if (this.contains(object))
        {
            return;
        }
        
        
        if (index <= 0)
        {
            Node<E> newNode = new Node<>(object);
            newNode.next = this.head;
            this.head = newNode;
        
            this.size++;
         
             if (this.tail == null)
             {
                this.tail = this.head;
             }
        }  
        
        
        else if (index >= this.size)
        {
             if (this.tail == null)
             {
                 this.head = this.tail = new Node<>(object);
             }
        
             else
             {
                Node<E> newNode = new Node<>(object);
                this.tail.next = newNode;
                this.tail = this.tail.next;
             }
        
                this.size++;
        }
        
        
        else
        {
                Node<E> current = this.head;
                
                for (int i = 1; i < index; i++)
                {
                    current = current.next;
                }
                
                    Node<E> temp = current.next;
                    current.next = new Node<>(object);
                   (current.next).next = temp;
                    this.size++;
                    
         }
        
        
        
    }

    
    
    
    
    
    
    
    @Override
    public E remove(int index) 
    {
         
        if (index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException();
        }  
        
        
        else if (index == 0)
        {
            if (!isEmpty())
            {
               E first = this.head.element;
               this.head = this.head.next;
               this.size--;
        
        
               if (isEmpty())
               {
                  this.tail = null;
               }
            
               return first;
            }
        
        
            else
            {
               throw new IndexOutOfBoundsException();
            }
            
        }
        
        
        else if (index == this.size - 1)
        {
            
            if (!isEmpty())
            {
               E last = this.tail.element;
               this.tail = this.tail.next;
               this.size--;
            
                if (isEmpty())
                {
                   this.head = null;
                }
             
                return last;
            }
        
        
            else
            {
               throw new IndexOutOfBoundsException();
            }
        }
        
        
        else
        {
            
                Node<E> previous = this.head;
                
                
                for (int i = 1; i < index; i++)
                {
                    previous = previous.next;
                }
                
                
                    Node<E> current = previous.next;
                    previous.next = current.next;
                    this.size--;
                    
                    
                    return current.element;
                                   
         }
          
    }
      
    

    
}
    
    
    
    
    

