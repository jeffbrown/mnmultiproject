package helper;

import javax.inject.Singleton;

@Singleton
public class MessageHelper {

    public String createGreeting() {
        return "Hello From MessageHelper";
    }
}
