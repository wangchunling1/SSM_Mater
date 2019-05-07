package com.oracle.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.mapper.MonsterMapper;
import com.oracle.web.bean.Monster;
import com.oracle.web.bean.SubMonster;
import com.oracle.web.bean.pageBean;
import com.oracle.web.service.MonsterService;

@Service
public class MonsterServiceImpl implements MonsterService {

	@Autowired
	private MonsterMapper monsterMapper;

	@Override
	@Transactional(readOnly=true)
	public List<SubMonster> list() {
		// TODO Auto-generated method stub
		return this.monsterMapper.selectAllWithOneSQL();
	}

	@Override
	@Transactional
	public int save(Monster monster) {
		// TODO Auto-generated method stub
		return this.monsterMapper.insert(monster);
	}

	@Override
	@Transactional
	public void delete(Monster monster) {
		// TODO Auto-generated method stub
		this.monsterMapper.deleteByPrimaryKey(monster.getMonsterId());
	}

	@Override
	@Transactional(readOnly=true)
	public Monster queryOneMonster(Integer monsterId) {
		// TODO Auto-generated method stub
		return this.monsterMapper.selectByPrimaryKey(monsterId);
	}

	@Override
	@Transactional
	public void update(Monster monster) {
		// TODO Auto-generated method stub
		this.monsterMapper.updateByPrimaryKey(monster);
	}

	@Override
	public pageBean<SubMonster> showPage(Integer pageNow,int pageSize) {
		// TODO Auto-generated method stub
		pageBean<SubMonster> pb = new pageBean<SubMonster>();

		pb.setPageNow(pageNow);

		pb.setPageSize(pageSize);
		
		//查看有多少条
		int sum=monsterMapper.selectCounts();
		
		pb.setCounts(sum);
		
		//从第几条开始
		int index=(pageNow-1)*pageSize;
		
		List<SubMonster> list=this.monsterMapper.findByPage(index);
		
		pb.setBeanList(list);
		
		return pb;
	}

	@Override
	public pageBean<SubMonster> showAllByPage(Integer pageNow) {
		// TODO Auto-generated method stub
		
		pageBean<SubMonster> pb = new pageBean<SubMonster>();
		
		//当前页的数据
		PageHelper.startPage(pageNow,2);
		
		//已经是分页好的数据了
		List<SubMonster> list=this.monsterMapper.showAllByPage();
		
		pb.setBeanList(list);
		
		//总记录数
		PageInfo<SubMonster> pi=new PageInfo<SubMonster>(list);
		
		pb.setCounts((int) pi.getTotal());

		//当前页
		pb.setPageNow(pi.getPageNum());

		//每页显示的条数，自定义
		pb.setPageSize(pi.getPageSize());
				
		return pb;
	}

}
