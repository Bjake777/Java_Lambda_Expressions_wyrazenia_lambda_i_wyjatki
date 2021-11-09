@FunctionalInterface
public interface Operation {
    String checkIt(String article) throws TooLongException;

}
