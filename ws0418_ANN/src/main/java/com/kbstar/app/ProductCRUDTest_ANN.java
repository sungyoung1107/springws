package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductCRUDTest_ANN {
    public static void main(String[] args) {
        // spring 판데기 실행
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<Integer, ProductDTO> service =
                (MyService<Integer, ProductDTO>) factory.getBean("pservice");

        // register test
        ProductDTO p1 = new ProductDTO(1, "청바지", 39000, 10);
        service.register(p1);

        // remove test
        service.remove(1);

        // modify test
        ProductDTO p2 = new ProductDTO(1, "청바지", 39900, 10);
        service.modify(p2);

        // get(String s) test
        service.get(1);

        // get() test
        service.get();

    }
}
