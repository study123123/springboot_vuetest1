package com.jxd.emp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.emp.model.Emp;

import java.util.Map;

public interface IEmpService extends IService<Emp> {
    Map<String,Object> selectByPage(String page,String limit,String ename);
}
