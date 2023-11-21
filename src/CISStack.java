import java.util.Arrays;

public class CISStack {
    Integer[] array;
    int size;
    int index;
    public CISStack(int value){
        array = new Integer[value];
        int size = 0;
        int index = 0;
    }

    public void push(int value){
        array[index] = value;
        index++;
        size++;
    }

    public Object pop(){
        if (size == 0)
        {return null;}
        int value = array[index-1];
        array[index] = null;
        index--;
        size--;
        return value;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public int size(){
        return size;
    }
    public String toString(){
        String result = "CISStack{stack=[";
        for (int i = 0; i < array.length; i++){
            result += "" + array[i] + ", ";
        }
        result = result.substring(0,result.length()-2);
        result += "], size=" + size + ", pointer=" + (index - 1) + "}";
        return result;
    }

}
