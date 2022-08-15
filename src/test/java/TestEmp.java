import com.jxd.emp.EmpApplication;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IEmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/9
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmpApplication.class)
public class TestEmp {
    @Autowired
    private IEmpService empService;

    @Test
    public void test(){
        /*Emp emp = new Emp();
        //emp.setEmpno(8);
        emp.setEname("李四");
        emp.setDeptno(1);
        empService.save(emp);*/

        /*Map<String,Object> map = empService.selectByPage("1","5");
        System.out.println(map.get("count"));
        List<Map<String,Object>> list = (List<Map<String,Object>>)map.get("data");

        for(Map map1 : list){
            System.out.println(map1.get("ename"));
            System.out.println(map1.get("dname"));
        }*/


    }


}
