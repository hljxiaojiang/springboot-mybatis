package com.change.dao.quartz;

import com.change.entity.quartz.AutoDeduction;

public interface AutoDeductionDao {
    int deleteByPrimaryKey(Long id);

    int insert(AutoDeduction record);

    int insertSelective(AutoDeduction record);

    AutoDeduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AutoDeduction record);

    int updateByPrimaryKey(AutoDeduction record);
}