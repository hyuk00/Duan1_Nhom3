
import java.util.List;
package DAO;

public abstract class Interface<E, K> {
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void vohieuhoa(K key);
    abstract public List<E> selectAll();
    abstract public E selectById(K key);
    abstract protected List<E> selectBySql(String sql, Object...args);
}



