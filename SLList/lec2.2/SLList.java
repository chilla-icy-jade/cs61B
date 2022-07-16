public class SLList {

    /* Intnode has two args (item , next) */
    public Intnode first;

    public SLList(int x) {
        first = new Intnode(x, null);
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
        first = new Intnode(x, first);
    }

    /*
     * 2.add int to the end of the list by iterative method
     */

    public void addlast(int x) {
        Intnode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Intnode(x, null);
    }

    /* error version : addlast() */
    // public void addlast(int x){

    // while (first.next!=null){
    // first=first.next;
    // }
    // first.next=new Intnode(x,null);
    // }

    // /* 3.print the size of list : iterative method */
    // public int size(){
    // int s = 1 ;
    // while (first.next != null){
    // s=s+1;
    // first = first.next;
    // }

    // return s;
    // }

    /* print the size of list : recursion method */

    public int size(Intnode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(first);
    }

    /* print the start of the list */
    public int getfirst() {
        return first.item;
    }

    /* print the end of the list */
    public int getlast() {
        Intnode l = first;
        while (l.next != null) {
            l = l.next;
        }
        return l.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addfirst(5);
        L.addfirst(14);
        L.addfirst(34);
        L.addlast(20);
        System.out.println(L.getfirst());
        System.out.println(L.getlast());
        System.out.println(L.size());
    }

}