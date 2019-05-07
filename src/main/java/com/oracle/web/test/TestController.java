package com.oracle.web.test;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.School;
import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class TestController {

	@Autowired
	WebApplicationContext context;

	// 模拟发送请求
	MockMvc mvc;

	@Before
	public void init() {

		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testPage() throws Exception {

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/monsters")).andReturn();

		MockHttpServletRequest request = mvcResult.getRequest();

		pageBean<SubMonster> pb = (pageBean<SubMonster>) request.getAttribute("pb");

		List<SubMonster> list = pb.getBeanList();

		for (SubMonster subMonster : list) {

			System.out.println(subMonster);
		}

	}
}
