package com.easy.archiecture.controller;


import com.easy.archiecture.entity.Demo;
import com.easy.archiecture.entity.TableData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class DemoController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("host", "localhost");
        return "demo";
    }


    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public String index() {
        return "demo1";
    }


    @RequestMapping(value = "/demoData", method = RequestMethod.GET)
    @ResponseBody
    public List<Demo> demoData() {
        List<Demo> returnList = new ArrayList<>();
        returnList.add(new Demo("1", "aaa", "1", "0"));
        returnList.add(new Demo("2", "bbb", "11", "1"));
        returnList.add(new Demo("3", "ccc", "12", "1"));
        returnList.add(new Demo("4", "ddd", "13", "2"));
        returnList.add(new Demo("5", "eee", "14", "3"));
        returnList.add(new Demo("6", "fff", "15", "2"));
        returnList.add(new Demo("7", "ggg", "16", "3"));
        returnList.add(new Demo("8", "hhh", "17", "4"));
        returnList.add(new Demo("9", "iii", "18", "2"));
        returnList.add(new Demo("10", "jjj", "19", "0"));

        return returnList;
    }

    @RequestMapping(value = "/tableData", method = RequestMethod.GET)
    @ResponseBody
    public List<TableData> tableData() {
        List<TableData> returnList = new ArrayList<>();
        returnList.add(new TableData(new Date(), "a", "b"));
        returnList.add(new TableData(new Date(), "c", "d"));
        returnList.add(new TableData(new Date(), "e", "f"));
        returnList.add(new TableData(new Date(), "g", "h"));
        returnList.add(new TableData(new Date(), "asdf", "asdfas"));
        returnList.add(new TableData(new Date(), "sadfasdf", "asdfasdf"));
        returnList.add(new TableData(new Date(), "asdfasdf", "ddddddd"));

        return returnList;
    }


}
