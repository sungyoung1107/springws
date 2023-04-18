package com.kbstar.service;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;

import java.util.List;

public class ProductService implements MyService<Integer, ProductDTO> {

    MyDao<Integer, ProductDTO> dao;

    public ProductService(MyDao dao){
        this.dao = dao;
    }
    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("register.");
    }

    @Override
    public void remove(Integer s) {
//        dao.delete(s);
        System.out.println("remove.");
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("modify.");
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
