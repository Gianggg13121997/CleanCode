package Manager;

import java.util.ArrayList;

public interface IManager<E>{
    void add(E e);
    void remove(int id);
    int findIndexbyId(int id);
    void update(int id, E e);
    ArrayList<E> findAll();
}