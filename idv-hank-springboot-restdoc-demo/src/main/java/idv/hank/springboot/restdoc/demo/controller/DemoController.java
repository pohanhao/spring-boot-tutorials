package idv.hank.springboot.restdoc.demo.controller;

import idv.hank.springboot.restdoc.demo.model.HelloResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody HelloResponse hello() {
        return new HelloResponse("Hank", "Hello world.");
    }

}
