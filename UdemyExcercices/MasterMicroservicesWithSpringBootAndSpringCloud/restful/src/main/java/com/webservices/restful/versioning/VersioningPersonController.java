package com.webservices.restful.versioning;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionPerson() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionPerson() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }    

    @GetMapping(path="/person",params="version=1")
    public PersonV1 getFirstVersionPersonRequestParameter() {
        return new PersonV1("Bob Charlie");
    }
    
    @GetMapping(path="/person",params="version=2")
    public PersonV2 getSecondVersionPersonRequestParameter() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }    

    @GetMapping(path="/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionPersonHeader() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path="/person/header",headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionPersonHeader() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }
    
}
