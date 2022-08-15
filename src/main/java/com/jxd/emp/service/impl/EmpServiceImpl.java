package com.jxd.emp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.emp.dao.IEmpDao;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/9
 * @Version 1.0
 */
@Service
public class EmpServiceImpl extends ServiceImpl<IEmpDao, Emp> implements IEmpService {
    @Autowired
    private IEmpDao empDao;

    @Override
    public Map<String, Object> selectByPage(String page, String limit,String ename) {
        //用于存储前台需要的数据
        Map<String, Object> map = new HashMap(4);
        if(page != null && limit != null){
            Page<Map<String, Object>> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            IPage<Map<String, Object>> pageMap = empDao.selectByPage(pages,ename);
            //数据总条数
            map.put("count",pageMap.getTotal());
            //当前页的数据
            map.put("data",pageMap.getRecords());
            map.put("code",0);
            return map;
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
            return map;
        }
    }
}
