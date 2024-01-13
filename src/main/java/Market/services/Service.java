package Market.services;

import java.util.List;

public interface Service <T>{
    public T get(T tmp);
    public void add(T object);
    public List<T> getAll();
}
