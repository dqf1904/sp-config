package com.tedu.sp01.service;

import java.util.List;
import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据订单id获取商品列表
	List<Item> getItems(String orderId);
	//在保存商品订单时减少商品库存
	void decreaseNumbers(List<Item> list);

}
