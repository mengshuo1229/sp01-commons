package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
    /**
     * ��ȡ�û���Ϣ �����û�id
     *
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * �����û�����
     *
     * @param id    �û�id
     * @param score ���ӵĻ���ֵ
     */
    void addScore(Integer id, Integer score);
}
