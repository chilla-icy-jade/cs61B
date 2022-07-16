/*  'DogLauncher' is to test drive the 'Dog' method   */
public class DogLauncher {
    public static void main(String[] args) {

        DogWeight smalldog;
        DogWeight largedog;
        smalldog = new DogWeight(40);
        largedog = new DogWeight(80);
        smalldog.Voice();
        largedog.Voice();

    }
}