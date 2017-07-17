import java.util.ArrayList;

/**
 * Created by nana1 on 7/2/2017.
 */
//list is an ordered collection, allows to have elements at specific position
// arraylist is a resizable array, resize automatically
//ArrayList is a class, it can have it's own constructor
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    // add an element
    public void addGroceryItem(String item) {
        groceryList.add(item); //add element into arraylist
    }

    // getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //print the arrayList
    public void printGroceryList() {
        System.out.println("You have " +groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1)+ ". "+ groceryList.get(i));
        }
    }

    //modify an element by name
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryList(position, newItem);
        }
    }

    //modify an element by position
    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position+1)+ " has benn modified.");
    }

    //remove an element by name
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    // remove an element by position
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //query arraylist and retrieve the index of an element
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }


}
