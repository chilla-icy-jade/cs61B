public class Dog {
    public int weight;

    public Dog(int w) {
        weight = w;
    }

    public void Voice() {
        if (weight < 10) {
            System.out.println("yiiii");
        }

        else if (weight < 30) {
            System.out.println("wang");
        } else {
            System.out.println("wooof");
        }
    }

    /*
     * This is a static version
     * invoked by class name
     */
    public static Dog Dogmax1(Dog d1, Dog d2) {
        if (d1.weight > d2.weight)
            return d1;
        else
            return d2;
    }

    /*
     * This is a non-static version
     * invoked by instance name
     */
    public Dog Dogmax2(Dog d2) {
        if (this.weight > d2.weight)
            return this;
        else
            return d2;

    }

}
