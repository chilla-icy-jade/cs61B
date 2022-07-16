public class Alistlauncher {
    public static void main(String[] args) {
        Alist A = new Alist();
        A.addlast(5);
        A.addlast(14);
        A.addlast(34);
        A.addlast(20);
        System.out.println(A.getfirst());
        System.out.println(A.getlast());
        System.out.println(A.size());
    }
}
