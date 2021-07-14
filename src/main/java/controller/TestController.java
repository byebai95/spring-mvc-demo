package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class TestController {

    @GetMapping
    public ModelAndView view(){
        Date date = new Date();
        ModelAndView model = new ModelAndView();
        model.addObject("date",date);
        model.setViewName("index");
        return model;
    }

}
