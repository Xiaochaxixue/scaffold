package com.song.scaffold.controllller;

import com.song.scaffold.pojo.ObjectScaffold;
import com.song.scaffold.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    ObjectService objectService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ObjectScaffold test(){
        Long test = new Long(1);
        return objectService.queryById(test);
    }
}
