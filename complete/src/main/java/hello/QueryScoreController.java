package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by leo on 15/10/25.
 */

@RestController
public class QueryScoreController {

    //private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/queryScore")
    public QueryScore QueryScore(@RequestParam(value = "score", defaultValue = "99.5") Float score) {
        return new QueryScore(counter.incrementAndGet(), score);
    }

}
