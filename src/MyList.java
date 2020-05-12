import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    protected MyList(){
        elements =new Object[DEFAULT_CAPACITY];
    }

    //Tăng gấp đôi kích thước mảng chứa các phần tử
    public void ensureCapacity(){
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }

    //thêm một phần tử vào cuối của danh sách
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }

    public E get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Err!, Index: "+i+", Size: "+size);
        }
        return (E) elements[i];
    }


}
