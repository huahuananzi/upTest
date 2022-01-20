package com.naughty.userlogin02.dao;

import com.naughty.userlogin02.bean.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierDao {
    public List<Supplier> getAllSupplier(@Param("name") String name);
//    public int addSupplier(Supplier supplier);
//    public int deleteSupplier(int id);
//    public Supplier getUpdateSupplier(int id);
//    public int editSupplier(Supplier supplier);
}
