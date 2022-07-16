public class Intlist {

    public int first;
    public Intlist rest;

    public Intlist(int f, Intlist r) {
        first = f;
        rest = r;
    }

    /* recursion method */
    public int box_Size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.box_Size();

    }

    public static void main(String[] args) {

        Intlist L = new Intlist(5, null);
        L = new Intlist(10, L);
        L = new Intlist(100, L);
        System.out.println(L.box_Size());

    }

}