/* different voice depended on weight
   pratice of 'if' 'else if'
 */
public class DogWeight {
    public static int WeightInPounds;

    /* this is a constructor */
    public DogWeight(int w) {
        WeightInPounds = w;
    }

    public static void Voice() {

        if (WeightInPounds < 10) {
            System.out.println("yiiiii");
        }

        else if (WeightInPounds < 30) {
            System.out.println("bark!");
        }

        else {
            System.out.println("awooooo");
        }
    }
}