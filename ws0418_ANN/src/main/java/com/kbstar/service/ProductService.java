package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pservice")
public class ProductService implements MyService<Integer, ProductDTO> {

    @Autowired
    ProductDAO dao;
//    MyDao<Integer, ProductDTO> dao;

    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("product register.");
    }

    @Override
    public void remove(Integer s) {
//        dao.delete(s);
        System.out.println("product delete.");
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("product modify.");
    }

    @Override
    public ProductDTO get(Integer s) {
        System.out.println("product get.");
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        System.out.println("product_list get.");
        return dao.select();
    }
}
