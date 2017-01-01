package org.dontpanic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Stevie on 01/01/2017.
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "helloWorld";
    }
}
