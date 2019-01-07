package com.mwalas.Library.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public String index(Locale locale, Model model) {
        String appName = "Library Manager";
        model.addAttribute("appName", appName);
        return "index";
    }

}
