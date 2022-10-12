package Weekend_Task.Forelesning;

public class CircularBuffer {
    int size;
    char [] buffer;
    int head;
    int tail;
    int count;

    public CircularBuffer(int size){
        this.buffer = new char[size];
        this.size = size;
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    void pushBack(char value){
        if(count + 1 > size){
            throw new IndexOutOfBoundsException("Ingen flere elementer igjen");
        }
            buffer[tail] = value;
            tail = (tail +1) % size;
            count = count + 1;

    }

    char popFront(){
        if(count <= 0){
            throw new IndexOutOfBoundsException("Tomt");
        }
        char out = buffer[head];
        buffer[head] = '*';
        head = (head + 1) % size;
        count = count -1;
        return out;
    }

    void print(){
        System.out.println();
        System.out.println(buffer);
        for (int i = 0; i < size; i++){
            if (i == head) System.out.print("h");
            else if (i == tail) System.out.print("t");
            else System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(20);
        char[] values = "ABCDEFGHIJKLMNOPQRST".toCharArray();

        for(int i = 0; i < values.length; i++){
                buffer.pushBack(values[i]);
        }
        System.out.println(buffer.buffer);

        while (buffer.count > 0) {
            buffer.popFront();
            buffer.print();
        }




    }
}
