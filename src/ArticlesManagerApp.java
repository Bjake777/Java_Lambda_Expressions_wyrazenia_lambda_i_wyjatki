public class ArticlesManagerApp {
    public static void main(String[] args) {
        //String articles = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        Operation operation = article -> {
            if(article.length() > 255) {
                throw new TooLongException();
            }
            return article.substring(0, 31);
        };

        try {
            String art = operation.checkIt("Now, if the map operation sdbjbdjksbajvsjadvbksajdvbjdbvskvbjlkdbsvkj");
            System.out.println(art);
            art = operation.checkIt("Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.vNow, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number and it returns all prime factors of the number then you have a Stream of Stream of integers. That's where the flatmap function helps.");
            System.out.println(art);
        } catch (TooLongException e) {
            System.out.println("Too long text");
        }
        Article article = new Article("asddf.", "assddfsg");

        Operation1 operation1 = article2 -> {
            String newtitle = article2.getTitle();
            if(!newtitle.endsWith(".")){
                newtitle = article2.getTitle()+".";
            }
            return capitalize(newtitle);
        };

        Operation1 operation3 = article3 -> !article3.getTitle().endsWith(".") ? article3.getTitle()+".": article3.getTitle();

        String title = operation1.returnTitle(article);
        System.out.println(title);
    }

    private static String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
