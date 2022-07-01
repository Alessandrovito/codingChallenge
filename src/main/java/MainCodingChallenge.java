import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class MainCodingChallenge {

    static List<User> users = Arrays.asList(new User("John", "Martin", 40),
            new User("Gregor", "Rheis", 34),
            new User("Mary", "Keit", 35)
    );

    static String nameForOptional = "test";

    public static void main(String[] args) throws Exception {

        MainCodingChallenge mainCodingChallenge = new MainCodingChallenge();
        mainCodingChallenge.startTest();

    }

    public void startTest() {

        useOptional(nameForOptional);
        useOptional(null);
        useStream(users);
        useStream(null);
        useCompletableFuture(5,6);
    }

    //
    public Integer useOptional(String value) {
        //Create a Optional and assign the value passed to the function and return the length of the String. In case is null the value return  as a default value -1
        return -1;
    }

    public List<String> useStream(List<User> users) {
        //From this list of User entity, filter by age under < 40 and return a list of name
        return null;
    }

    public Integer useCompletableFuture(int a, int b){
        // create an executor of a fixed  5 threads pool
        //run the supplier task to invoke the method addFun1 passing 5 and 6
        // wait until to receive the response
        return -1;
    }

    public  Integer addFun1(int a, int b) {
        System.out.println(Instant.now() +" -" +Thread.currentThread().getName() + " BEFORE addFun1 with thread sleep 2,5 sec");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException interruptedException) {
            System.out.println("interruptedException.printStackTrace()");
            interruptedException.printStackTrace();
        }
        System.out.println(Instant.now() +" -" +Thread.currentThread().getName() + " AFTER addFun1 with thread sleep 2,5 sec");
        return a + b;
    }



}
