public class Main {

    public static void main(String[] args) {
	System.out.println("Some text");
        ToBeCalled toBeCalled = new ToBeCalled();
        toBeCalled.fromMain();
    }
}
