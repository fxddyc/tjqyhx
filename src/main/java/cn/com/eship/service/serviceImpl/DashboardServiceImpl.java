package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.Aajiqiyexinxi;
import cn.com.eship.models.ItfDclIoDecl;
import cn.com.eship.repository.AajiqiyexinxiMapper;
import cn.com.eship.repository.ItfDclIoDeclMapper;
import cn.com.eship.service.DashboardService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final ItfDclIoDeclMapper itfDclIoDeclMapper;
    private final AajiqiyexinxiMapper aajiqiyexinxiMapper;

    @Autowired
    public DashboardServiceImpl(ItfDclIoDeclMapper itfDclIoDeclMapper, AajiqiyexinxiMapper aajiqiyexinxiMapper) {
        this.itfDclIoDeclMapper = itfDclIoDeclMapper;
        this.aajiqiyexinxiMapper = aajiqiyexinxiMapper;
    }

    @Override
    @DataSource("eciq_database")
    public ItfDclIoDecl getTestData() {
        ItfDclIoDecl itfDclIoDecl = itfDclIoDeclMapper.selectByPrimaryKey("216000000000252");
        return itfDclIoDecl;
    }

    @Override
    @DataSource("cxxt_database")
    public Aajiqiyexinxi getTestData2() {
        Aajiqiyexinxi aajiqiyexinxi = aajiqiyexinxiMapper.selectByPrimaryKey("741376398");
        return aajiqiyexinxi;
    }
}
