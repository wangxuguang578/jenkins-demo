package com.wxg.demo.web;

import com.wxg.demo.service.impl.JenkinsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsControllerTest {

    @Autowired
    private JenkinsServiceImpl JenkinsService;
    @Test
    public void test1() {
        String str = JenkinsService.test1();
//        int i = 1 / 0;
        assert false;
    }
}
