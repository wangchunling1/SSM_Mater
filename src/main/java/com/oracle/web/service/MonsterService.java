package com.oracle.web.service;

import java.util.List;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;

public interface MonsterService {

	List<SubMonster> list();

	int save(Monster monster);

	void delete(Monster monster);

	Monster queryOneMonster(Integer monsterId);

	void update(Monster monster);

	pageBean<SubMonster> showPage(Integer pageNow, int pageSize);

	pageBean<SubMonster> showAllByPage(Integer pageNow);

}
