package cn.com.eship.service;

import cn.com.eship.models.ItfInsResultGoods;

import java.util.List;

public interface HolographicPortraitService {
    List<ItfInsResultGoods> getJYanRmb();
    List<ItfInsResultGoods> getJYiRmb();
    List<ItfInsResultGoods> getJYanBjpc();
    List<ItfInsResultGoods> getJYiBjpc();
    List<ItfInsResultGoods> getJYanQysm();
    List<ItfInsResultGoods> getJYiQysm();
}
