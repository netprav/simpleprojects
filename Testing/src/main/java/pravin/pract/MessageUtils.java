package pravin.pract;

/**
 * example from www.tutorialspoint.com/junit
 */
public class MessageUtils {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtils(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
