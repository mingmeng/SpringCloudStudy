package org.redrock.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;
    public String testService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hello?name="+name,String.class);
    }
}
