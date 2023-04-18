package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements MyDao<Integer, ProductDTO>  {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle: "+ productDTO);
    }

    @Override
    public void delete(Integer s) {
        System.out.println("Deleted Oracle: "+ s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle: "+ productDTO);
    }

    @Override
    public ProductDTO select(Integer s) {
        ProductDTO product = null;
        product = new ProductDTO(s, "청바지", 39000, 10);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = null ;
        list = new ArrayList();
        list.add(new ProductDTO(2, "블라우스", 49000, 20));
        list.add(new ProductDTO(3, "치마", 59000, 30));
        list.add(new ProductDTO(4, "양말", 3000, 50));
        return list;
    }
}
