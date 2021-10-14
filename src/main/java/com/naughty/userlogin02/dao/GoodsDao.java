package com.naughty.userlogin02.dao;


import com.naughty.userlogin02.bean.Goods;
import com.naughty.userlogin02.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    public List<Goods> getAllGoods(@Param("name") String name);
    public int editGoods(Goods goods);
    public Goods getUpdateGoods(int id);
    public int addGoods(Goods goods);
    public int deleteGoods(int id);
}
