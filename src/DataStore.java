import java.util.ArrayList;
import java.util.List;

class DataStore<T> {

    private List<T> dataList;

    public DataStore() {
        dataList = new ArrayList<>();
    }

    // store object
    public void add(T data) {
        dataList.add(data);
    }

    // retrieve all objects
    public List<T> getAll() {
        return dataList;
    }
}