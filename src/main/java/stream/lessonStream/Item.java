package stream.lessonStream;

public class Item {
    private int code;

    public Item(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "{code: " + code + '}';
    }
}
