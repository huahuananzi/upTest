package com.naughty.userlogin02.controller;


import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.bean.Goods;
import com.naughty.userlogin02.bean.QueryInfo;
import com.naughty.userlogin02.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GoodsController {

    @Autowired
    GoodsDao goodsDao;

    @RequestMapping("/allGoods")
    public HashMap getGoodsList(QueryInfo queryInfo) {
        //获取最大列表数查询信息和当前编号
        //System.out.println(queryInfo);
        //int numbers = goodsDao.getGoodsCounts("%" + queryInfo.getQuery() +"%");
        //int pageStart = (queryInfo.getPageNum() - 1) - queryInfo.getPageSize();

        List<Goods> goods = goodsDao.getAllGoods(queryInfo.getQuery());
//        goods = goods.stream().map(item->{
//            System.out.println(item.getName());
//            return item;
//        }).filter(item->1==1).collect(Collectors.toList());
        HashMap<String, Object> res = new HashMap<>();
       // res.put("numbers", numbers);
        res.put("data", goods);
        //System.out.println("总条数："+numbers);
        return res;
    }
    //添加商品
    @RequestMapping("/addGoods")
    public String getGoodsListByCode(Goods goods){

        int i = goodsDao.addGoods(goods);
        return i >0?"success":"error";
    }


    //修改商品信息前获取信息
    @RequestMapping("/getGoodsUpdate")
    public Goods getUpdateGoods(int id){
        Goods updateGoods = goodsDao.getUpdateGoods(id);
        return updateGoods;

    }
    //修改商品
    @RequestMapping("/editGoods")
    public String editGoods(@RequestBody Goods goods){
         int i = goodsDao.editGoods(goods);
         String str = i >0?"success":"error";
        return str;

    }
    @RequestMapping("/deleteGoods")
        public String deleteGoods(int id){
            int i = goodsDao.deleteGoods(id);
            return i > 0?"success":"error";
        }

}
