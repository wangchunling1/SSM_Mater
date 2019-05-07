package com.oracle.mapper;

import com.oracle.web.bean.School;
import java.util.List;

public interface SchoolMapper {

    int deleteByPrimaryKey(Integer schoolId);

    int insert(School record);

    School selectByPrimaryKey(Integer schoolId);

    List<School> selectAll();

    int updateByPrimaryKey(School record);
}