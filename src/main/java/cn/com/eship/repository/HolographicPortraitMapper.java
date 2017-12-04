package cn.com.eship.repository;

import cn.com.eship.models.ItfInsResultGoods;

import java.util.List;

public interface HolographicPortraitMapper {
    List<ItfInsResultGoods> selectJYanRmb();
    List<ItfInsResultGoods> selectJYiRmb1();
    List<ItfInsResultGoods> selectJYiRmb2();
    List<ItfInsResultGoods> selectJYanBjpc();
    List<ItfInsResultGoods> selectJYiBjpc1();
    List<ItfInsResultGoods> selectJYiBjpc2();
    List<ItfInsResultGoods> selectJYanQysm();
    List<ItfInsResultGoods> selectJYiQysm1();
    List<ItfInsResultGoods> selectJYiQysm2();
    List<ItfInsResultGoods> selectDyfb();
}
