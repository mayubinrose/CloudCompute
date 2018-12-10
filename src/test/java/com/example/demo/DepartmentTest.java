package com.example.demo;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Autowired
    private DepartmentMapper mapper;

    @Test
    public void testInsert(){
        Department de = new Department();
        de.setId(1);
        de.setName("雅法比");
        de.setDescr("老发颤");
        this.mapper.insert(de);
    }
    @Test
    public void testGetById() {
        Department department = this.mapper.getById(1);
        System.out.println(department);
    }

    @Test
    public void testUpdate() {
        Department department = new Department();
        department.setId(1);
        department.setDescr("开发高级产品");
        this.mapper.update(department);
    }

    @Test
    public void testDeleteById() {
        this.mapper.deleteById(1);
    }

}
