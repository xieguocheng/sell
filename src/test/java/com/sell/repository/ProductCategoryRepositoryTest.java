package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional  //设置这个执行完sql语句会回滚，不会插入数据
    public void addOneTest(){
        ProductCategory pc = new ProductCategory();
        pc.setCategoryId(2);
        pc.setCategoryName("2");
        pc.setCategoryType(2);
        repository.save(pc);

    }
    @Test
    public void findListTest() {
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> productCategory= repository.findByCategoryTypeIn(list);
        System.out.println(productCategory.toString());

        //update
        Optional<ProductCategory> pc=repository.findById(1);
        ProductCategory p=pc.get();
        p.setCategoryType(111);
        repository.saveAndFlush(p);
    }

}