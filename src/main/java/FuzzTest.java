import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class FuzzTest {
    public static HelloWorld tester = new HelloWorld();
    public static void fuzzerTestOneInput(FuzzedDataProvider data) throws Exception {
        System.out.println(data.consumeInt());
        tester.Add(0, data.consumeInt());
    }
}
