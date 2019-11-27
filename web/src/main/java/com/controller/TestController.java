package com.controller;

import com.entity.Dept;
import com.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private DeptServiceImpl deptService;

    @RequestMapping("/aa")
    public ModelAndView xxx(@Valid Dept dept, BindingResult bindingResult){
        ModelAndView mav = new ModelAndView();
        if (bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (int i = 0; i < fieldErrors.size(); i++) {
//                System.out.println(fieldErrors.get(i));
                System.out.println(fieldErrors.get(i).getField()+" : "+fieldErrors.get(i).getDefaultMessage());

            }
//            deptService.insert();
            mav.addObject("isError","yes");
        }else{
            System.out.println(dept.toString());
            mav.addObject("isError","none");
        }
        mav.setViewName("index");
        return mav;
    }
}
