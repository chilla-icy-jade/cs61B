/* for static version */

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(20);
        Dog d2 = new Dog(15);
        Dog bigger = Dog.Dogmax1(d1, d2);
        bigger.Voice();
    }

}

/* for non-static version */
// public class DogLauncher {
// public static void main(String[] args) {
// Dog d = new Dog(20);
// Dog d2 = new Dog(15);
// Dog bigger = d.Dogmax2(d2);
// bigger.Voice();
// }

// }