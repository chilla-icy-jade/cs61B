public class sorttest {
    public static void sorttest() {
        String[] input = { "i", "have", "an", "egg" };
        String[] expected = { "egg", "have", "an", "i" };
        sort.sort(input);

        org.junit.Assert.assetArrayEquals(expected, input);
    }

    public void main() {
        sorttest();
    }
}
