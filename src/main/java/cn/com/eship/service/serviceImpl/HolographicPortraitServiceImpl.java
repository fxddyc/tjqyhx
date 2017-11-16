package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.ItfInsResultGoods;
import cn.com.eship.repository.HolographicPortraitMapper;
import cn.com.eship.service.HolographicPortraitService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolographicPortraitServiceImpl implements HolographicPortraitService {

    private final HolographicPortraitMapper itfInsResultGoodsMapper;

    @Autowired
    public HolographicPortraitServiceImpl(HolographicPortraitMapper itfInsResultGoodsMapper) {
        this.itfInsResultGoodsMapper = itfInsResultGoodsMapper;
    }


    @Override
    @DataSource("eciq_database")
    public List<ItfInsResultGoods> getJYanRmb() {
        List<ItfInsResultGoods> itfInsResultGoodsList = itfInsResultGoodsMapper.selectJYanRmb();
        return null;
    }

    @Override
    @DataSource("eciq_database")
    public List<ItfInsResultGoods> getJYiRmb() {
        List<ItfInsResultGoods> itfInsResultGoodsList1 = itfInsResultGoodsMapper.selectJYiRmb1();
        List<ItfInsResultGoods> itfInsResultGoodsList2 = itfInsResultGoodsMapper.selectJYiRmb2();
        return null;
    }

    @Override
    public List<ItfInsResultGoods> getJYanBjpc() {
        List<ItfInsResultGoods> itfInsResultGoodsList = itfInsResultGoodsMapper.selectJYanBjpc();
        return null;
    }

    @Override
    public List<ItfInsResultGoods> getJYiBjpc() {
        List<ItfInsResultGoods> itfInsResultGoodsList1 = itfInsResultGoodsMapper.selectJYiBjpc1();
        List<ItfInsResultGoods> itfInsResultGoodsList2 = itfInsResultGoodsMapper.selectJYiBjpc2();
        return null;
    }

    @Override
    public List<ItfInsResultGoods> getJYanQysm() {
        List<ItfInsResultGoods> itfInsResultGoodsList=itfInsResultGoodsMapper.selectJYanQysm();
        return null;
    }

    @Override
    public List<ItfInsResultGoods> getJYiQysm() {
        List<ItfInsResultGoods> itfInsResultGoodsList1 = itfInsResultGoodsMapper.selectJYiQysm1();
        List<ItfInsResultGoods> itfInsResultGoodsList2 = itfInsResultGoodsMapper.selectJYiQysm2();
        return null;
    }

}
