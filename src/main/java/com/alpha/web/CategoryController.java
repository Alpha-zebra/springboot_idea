package com.alpha.web;


import com.alpha.dao.CategoryDAO;
import com.alpha.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryDAO categoryDAO;

    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception{
        System.out.println("list category");
        List<Category> cs=categoryDAO.findAll();
        m.addAttribute("cs",cs);
        cs.forEach(c->{
            System.out.println(c.getName());
        });
        return "listCategory";
    }
}
