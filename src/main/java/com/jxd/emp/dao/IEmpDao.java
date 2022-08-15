package com.jxd.emp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.emp.model.Emp;

import java.util.List;
import java.util.Map;

public interface IEmpDao extends BaseMapper<Emp> {

    IPage<Map<String,Object>> selectByPage(Page<Map<String,Object>> page,String ename);

}
