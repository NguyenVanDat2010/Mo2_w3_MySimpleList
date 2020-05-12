import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    protected MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Tăng gấp đôi kích thước mảng chứa các phần tử
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //thêm một phần tử vào cuối của danh sách
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    //Trả về phần tử vừa ở vị trí thứ i trong danh sách.
    //Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Err!, Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }
}
