package com.jxd.emp.controller;

import com.jxd.emp.model.Dept;
import com.jxd.emp.model.Emp;
import com.jxd.emp.model.Users;
import com.jxd.emp.service.IDeptService;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/9
 * @Version 1.0
 */
//代表当前controller类中的请求方法都是直接向前台返回数据的,
// 每个请求方法不再需要单独添加@ResponseBody注解
@RestController
public class EmpController {

    @Autowired
    private IEmpService empService;

    @Autowired
    private IDeptService deptService;

    @RequestMapping("/login")
    public String login(@RequestBody Users users){
        if("admin".equals(users.getUname()) && "123".equals(users.getPwd())){
            return "success";
        }
        return "error";
    }

    /**
     * 分页查询员工信息及部门名称
     * @return
     */
    @RequestMapping("/list")
    public Map<String,Object> getEmpList(@RequestBody Map<String,String> queryMap){
        String page = queryMap.get("page");
        String limit = queryMap.get("limit");
        String ename = queryMap.get("ename");
        return empService.selectByPage(page,limit,ename);
    }

    @RequestMapping("/addEmp")
    public String addEmp(@RequestBody Emp emp){
       boolean isSuccess = empService.save(emp);
       if (isSuccess){
           return "success";
       }
       return "error";
    }

    /*@RequestMapping("/getById")
    public Emp getById(@RequestParam("empno") int empno){
        Emp emp = empService.getById(empno);
        return emp;
    }*/

    @RequestMapping("/getById/{empno}")
    public Emp getById(@PathVariable("empno") int empno){
        Emp emp = empService.getById(empno);
        return emp;
    }

    @RequestMapping("/editEmp")
    public String editEmp(@RequestBody Emp emp){
        boolean isSuccess = empService.updateById(emp);
        if (isSuccess){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/delEmp")
    public String delEmp(@RequestBody List<Integer> ids){
        boolean isSuccess = empService.removeByIds(ids);
        if (isSuccess){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/deptList")
    public List<Dept> getDeptList(){
        return deptService.list();
    }

}
