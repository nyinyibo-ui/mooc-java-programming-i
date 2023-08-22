
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        // if the list is empty return null;
        if (this.elements.isEmpty()) {
            return null;
        }

        // pre set the longest Element as the first element in the list
        String longestElement = this.elements.get(0);

        // read each element in the list
        for (String ele : this.elements) {
            // if the element length is longer than the pre set value, set the current element as longest element
            if (longestElement.length() < ele.length()) {
                longestElement = ele;
            }

        }
        return longestElement;

    }

}
