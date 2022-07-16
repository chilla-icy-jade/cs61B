public class SLList {

    /*
     * nested class
     * 'Intnode'
     * has two args (item , next)
     */

    public class Intnode {

        public int item;
        public Intnode next;

        public Intnode(int i, Intnode n) {
            item = i;
            next = n;
        }
    }

    public Intnode sentinel;
    public int size;
    /*
     * we have two kinds of Intnode (empty or non-empty)
     * the first item will be saved in the sentinel.next if it exists
     */

    /* calculate size() in each operation */

    public SLList(int x) {
        sentinel = new Intnode(0, null);
        sentinel.next = new Intnode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new Intnode(0, null);
        size = 0;
    }

    /*
     * extensions for SLList
     * addfirst()
     * addlast()
     * removelast()
     * size()
     */

    /* 1.add int to the start of the list */
    public void addfirst(int x) {
        size = size + 1;
        sentinel.next = new Intnode(x, sentinel.next);
    }

    /*
     * 2.add int to the end of the list by iterative method
     */

    public void addlast(int x) {

        size = size + 1;
        Intnode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Intnode(x, null);
    }

    /* print the start of the list */
    public int getfirst() {
        while (sentinel.next != null) {
            return sentinel.next.item;
        }
        return 0;
    }

    /* print the end of the list */
    public int getlast() {
        Intnode l = sentinel;
        while (l.next != null) {
            l = l.next;
        }
        return l.item;
    }

    public int size() {
        return size;
    }
}
