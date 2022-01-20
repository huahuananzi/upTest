package com.naughty.userlogin02.controller;

import com.naughty.userlogin02.bean.QueryInfo;
import com.naughty.userlogin02.bean.Supplier;
import com.naughty.userlogin02.dao.SupplierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    SupplierDao supplierDao;
    //查询所有供应商
    @RequestMapping("/allSupplier")
    public HashMap getAllSupplier(QueryInfo queryInfo) {
        List<Supplier> supplier = supplierDao.getAllSupplier(queryInfo.getQuery());
        HashMap<String, Object> res = new HashMap<>();
        res.put("data", supplier);
        return res;
    }
    //增加供应商
//    @RequestMapping("/addSupplier")
//    public String addSupplier(@RequestBody)
}
