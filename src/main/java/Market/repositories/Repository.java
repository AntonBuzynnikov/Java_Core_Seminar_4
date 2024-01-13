package Market.repositories;

import java.util.List;
import java.util.Objects;

public interface Repository <T>{
    public void add(T object);
    public T get(int i);
    public List<T> getAll();
}
