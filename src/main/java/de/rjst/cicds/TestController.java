package de.rjst.cicds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public Response test() {
        final var response = new Response();
        response.setMessage("Hello World!");

        return response;
    }

}
