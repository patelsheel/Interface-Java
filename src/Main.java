import java.util.ArrayList;
public class Main {
    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter filter) {
        ArrayList<Object> result = new ArrayList<>();

        for (Object obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}
