package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
    /**
     * ���ݶ���id,��ȡ������
     *
     * @param orderId
     * @return
     */
    List<Item> getItems(String orderId);

    void decreaseNumbers(List<Item> list);
}
