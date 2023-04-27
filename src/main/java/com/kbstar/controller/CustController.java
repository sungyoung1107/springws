package com.kbstar.controller;

import com.kbstar.dto.Cust;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j // 로그를 찍겠다.
@Controller
@RequestMapping("/cust")
public class CustController {
//    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    CustService service;
    String dir = "cust/";

    // 127.0.0.1/cust
    @RequestMapping("")
    public String main(Model model){
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "center");
//        logger.info("----------------------------------------------------------------------");
        Random r = new Random();
        int inx = r.nextInt(1000)+1;
        log.info(inx+"");
        return "index";
    }
    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "add");
        return "index";
    }

    @RequestMapping("/all")
    public String all(Model model) {

        List<Cust> list =null ;
        try {
            list = service.get();
        } catch (Exception e){
            e.printStackTrace();
        }

        model.addAttribute("clist", list);
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "all");
        return "index";
    }

    @RequestMapping("/get")
    public String get(Model model, String id){
        Cust cust = new Cust(id, "xxx", "james");
        model.addAttribute("gcust", cust);
        model.addAttribute("left",dir + "left");
        model.addAttribute("center",dir + "get");
        return "index";
    }

}
