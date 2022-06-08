public class HelloWorld {
    public static void main(String[] args) {
        //
    }

    public void Add (int a, int b) throws Exception {
        int result = a + b;
        System.out.println(result);

        if (result == 54395343) {
            throw new Exception("Hey hey hey you found a buggy wuggy");
        }
    }
}
