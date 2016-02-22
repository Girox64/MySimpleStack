package dcll.kgir;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by 21101843 on 17/02/2016.
 */
public class MySimpleStack implements SimpleStack{
    /*
    Com répondant à l'exigence Exigence
     */
    private List<Item> items;

    public MySimpleStack(){
        items=new ArrayList<Item>();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public int getSize(){
        return items.size();
    }

    public void push(Item item){
        items.add(item);
    }
    public Item peek() throws EmptyStackException {
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return items.get(items.size()-1);
    }
    public Item pop() throws EmptyStackException{
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        Item temps = items.get(items.size()-1);
        items.remove(items.size()-1);
        return temps;
    }
}
