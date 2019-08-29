package helper;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hello")
public class HelloController {

    private final MessageHelper messageHelper;

    public HelloController(MessageHelper messageHelper) {
        this.messageHelper = messageHelper;
    }

    @Get("/")
    public String index() {
        return messageHelper.createGreeting();
    }
}