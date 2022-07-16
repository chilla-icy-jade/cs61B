/* this file is a generic list whose items include 
 *  int strings.....
 */
public class SLList<generic> {
    public class Stuffnode {

        public generic item;
        public Stuffnode next;

        public Stuffnode(generic i, Stuffnode n) {
            item = i;
            next = n;
        }
    }

    public Stuffnode sentinel;
    public int size;
    /*
     * we have two kinds of Stuffnode (empty or non-empty)
     * the first item will be saved in the sentinel.next if it exists
     */

    /* calculate size() in each operation */

    public SLList(generic x) {
        sentinel = new Stuffnode("c", null);
        sentinel.next = new Stuffnode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new Stuffnode("c", null);
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
    public void addfirst(generic x) {
        size = size + 1;
        sentinel.next = new Stuffnode(x, sentinel.next);
    }

    /*
     * 2.add int to the end of the list by iterative method
     */

    public void addlast(generic x) {

        size = size + 1;
        Stuffnode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Stuffnode(x, null);
    }

    /* print the start of the list */
    public generic getfirst() {
        while (sentinel.next != null) {
            return sentinel.next.item;
        }
        return 0;
    }

    /* print the end of the list */
    public generic getlast() {
        Stuffnode l = sentinel;
        while (l.next != null) {
            l = l.next;
        }
        return l.item;
    }

    public int size() {
        return size;
    }
}
