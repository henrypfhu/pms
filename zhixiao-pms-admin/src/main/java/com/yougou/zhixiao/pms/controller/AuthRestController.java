package com.yougou.zhixiao.pms.controller;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * Created by he.wc on 2015/2/4.
 */
@RestController
@RequestMapping("/api")
public class AuthRestController {
    private static Logger logger = LoggerFactory.getLogger(AuthRestController.class);


    @RequestMapping(value = "permissions/{sid}",method = RequestMethod.GET,produces = "application/json")
    public Set<String> getPermissions(){
        Set<String> permissions = Sets.newHashSet();
        permissions.add("add");
        permissions.add("update");
        return permissions;
    }

    @RequestMapping(value = "testPermissions")
    public String testPermission(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Set> set = restTemplate.getForEntity("http://localhost:8080/zx-pms/api/permissions/12", Set.class);
        return set.getBody().toString();
    }

}
