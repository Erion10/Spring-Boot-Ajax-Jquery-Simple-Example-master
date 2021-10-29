package com.solehin.controller;

import com.solehin.model.BookingDto;
import com.solehin.model.SearchCriteria;
import com.solehin.services.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    UserService userService;
    private List<SearchCriteria> search = new ArrayList<>();

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "/book")
    public void getSearchResultViaAjax(@RequestBody List<SearchCriteria> href) {
        search.clear();
        for (int i=0;i<href.size();i++){
            search.add(href.get(i));
        }
    }
    @GetMapping(value = "/book")
    public ModelAndView sss(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("search", search);
        modelAndView.setViewName("testim");
        return modelAndView;
    }


//    @GetMapping("/api/search")
//    public int get(){
//        BookingDto bookingDto = new BookingDto();
//        int a = bookingDto.getPageSize();
//        return a;
//    }

}
