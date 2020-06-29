package com.masglobal.salarychallenge.demo.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeesViewController {
    @RequestMapping(path = "/view-employees",  method= RequestMethod.GET)
    public ModelAndView indexProfile (Model model) {
        ModelAndView modelAndView = new ModelAndView( );
        modelAndView.setViewName ("employee-view");
        return modelAndView;
    }
}
