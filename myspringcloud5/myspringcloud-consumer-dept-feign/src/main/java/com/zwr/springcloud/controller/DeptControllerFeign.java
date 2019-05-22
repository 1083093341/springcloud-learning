package com.zwr.springcloud.controller;


import com.zwr.springcloud.entities.Dept;
import com.zwr.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptControllerFeign {

    @Autowired(required = false)
    private DeptClientService service = null;
    
    @ResponseBody
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @ResponseBody
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return  this.service.list();
    }


    @ResponseBody
    @RequestMapping("/consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }
}
