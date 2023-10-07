package Seminar4;

public class MyArraylist<T>{
    private T[] array;
    private int currentindex = -1;

    public MyArraylist(T [] array){
        this.array = array;
    }
    public int size(){
        return currentindex +1;
    }
    public void add(T value){
        if (currentindex+1 < array.length){
            array[++currentindex]= value;
        }
    }
}
