package com.zwr.springcloud.controller;

import com.zwr.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * 部门消费者Controller
 */

@Controller
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @ResponseBody
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @ResponseBody
    @SuppressWarnings("unchecked")
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }




}
