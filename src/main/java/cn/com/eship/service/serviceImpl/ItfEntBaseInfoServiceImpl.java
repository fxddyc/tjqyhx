package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.ItfEntBaseInfo;
import cn.com.eship.repository.ItfEntBaseInfoMapper;
import cn.com.eship.service.ItfEntBaseInfoService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItfEntBaseInfoServiceImpl implements ItfEntBaseInfoService {

    private final ItfEntBaseInfoMapper itfEntBaseInfoMapper;

    @Autowired
    public ItfEntBaseInfoServiceImpl(ItfEntBaseInfoMapper itfEntBaseInfoMapper) {
        this.itfEntBaseInfoMapper = itfEntBaseInfoMapper;
    }

    @Override
    @DataSource("eciq_database")
    public List<ItfEntBaseInfo> getItfEntBaseInfo(String str) {
        return itfEntBaseInfoMapper.selectItfEntBaseInfo(str);
    }
}
