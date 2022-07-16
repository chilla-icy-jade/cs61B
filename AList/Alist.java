// this is an array list 
public class Alist {

    int[] item;
    int size;

    public Alist() {
        item = new int[2];
        size = 0;
    }

    /*
     * extensions for Alist
     * addfirst()
     * addlast()
     * removelast()
     * size()
     */

    // add int to the start
    // public void addfirst(int x) {
    // int i;
    // for (i = 0; i < item.length; i++) {
    // item[i + 1] = item[i];
    // }

    // item[0] = x;

    // size += 1;

    // }

    // add int to the end
    // resizing function
    public int[] resizing(int capacity) {
        int[] nitem = new int[capacity];
        System.arraycopy(item, 0, nitem, 0, size);
        item = nitem;
        return item;
    }

    public void addlast(int x) {
        if (size == item.length) {
            item = resizing(size + 1);
        }
        item[size] = x;
        size += 1;
    }

    public int getfirst() {
        return item[0];
    }

    public int getlast() {
        return item[size - 1];
    }

    public int size() {
        return size;
    }

}
