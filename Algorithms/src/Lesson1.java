import java.util.ArrayList;
import java.util.Iterator;

public class Lesson1 {

    ArrayList<String> myList = new ArrayList<String>();


    public void add(String name){
        myList.add(name);
    }

    public void remove(int index){
        myList.remove(index);
    }

    public void set(int index, String name){
        //set is to change an existing object
        myList.set(index, name);
    }


    public void iterateArray(){
        Iterator iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



    public String getArray(int index){
        String listName = myList.get(index);
        return listName;
    }

    public int getSize(){

        int size = myList.size();
        return size;
    }


}
