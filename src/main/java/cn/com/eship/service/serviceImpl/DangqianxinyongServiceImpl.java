package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.Dangqianxinyongxinxi;
import cn.com.eship.repository.DangqianxinyongMapper;
import cn.com.eship.service.DangqianxinyongService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DangqianxinyongServiceImpl implements DangqianxinyongService {

    private final DangqianxinyongMapper  dangqianxinyongMapper;

    @Autowired
    public DangqianxinyongServiceImpl(DangqianxinyongMapper dangqianxinyongMapper) {
        this.dangqianxinyongMapper = dangqianxinyongMapper;
    }

    @Override
    @DataSource("cxxt_database")
    public Map getDangqianxinyong() {
     List<Dangqianxinyongxinxi> list  =  dangqianxinyongMapper.selectDangqianxinyong();
         Map map = new HashMap();
         List aList = new ArrayList<>();
         List bList = new ArrayList<>();
         List cList = new ArrayList<>();
         List dList = new ArrayList<>();
         List aaList = new ArrayList<>();
         List hzList = new ArrayList<>();

        if(list.size()>0) {
            for (Dangqianxinyongxinxi dqxy : list) {
                Map amap = new HashMap();
                Map aamap = new HashMap();
                Map dmap = new HashMap();
                Map cmap = new HashMap();
                Map bmap = new HashMap();
                int [] aNum=new int[2];
                int [] bNum=new int[2];
                int [] cNum=new int[2];
                int [] dNum=new int[2];
                int [] aaNum=new int[2];
                if (dqxy.getDqxyjb().equals("A")) {
                    aNum[0] = Integer.parseInt(dqxy.getDqxyfz());
                    aNum[1] = dqxy.getBjpc();
                    amap.put("value",aNum);
                    amap.put("name",dqxy.getQymc());
                    aList.add(amap);
                    hzList.add(amap);
                }
                if (dqxy.getDqxyjb().equals("B")) {
                    bNum[0] = Integer.parseInt(dqxy.getDqxyfz());
                    bNum[1] = dqxy.getBjpc();
                    bmap.put("value",bNum);
                    bmap.put("name",dqxy.getQymc());
                    bList.add(bmap);
                    hzList.add(bmap);
                }
                if (dqxy.getDqxyjb().equals("C")) {
                    cNum[0] = Integer.parseInt(dqxy.getDqxyfz());
                    cNum[1] = dqxy.getBjpc();
                    cmap.put("value",cNum);
                    cmap.put("name",dqxy.getQymc());
                    cList.add(cmap);
                    hzList.add(cmap);
                }
                if (dqxy.getDqxyjb().equals("D")) {
                    if(Integer.parseInt(dqxy.getDqxyfz())>0){
                        dNum[0] = Integer.parseInt(dqxy.getDqxyfz());
                        dNum[1] = dqxy.getBjpc();
                        dmap.put("value",dNum);
                        dmap.put("name",dqxy.getQymc());
                        dList.add(dmap);
                        hzList.add(dmap);
                    }
                }
                if (dqxy.getDqxyjb().equals("AA级")) {
                    aaNum[0] = Integer.parseInt(dqxy.getDqxyfz());
                    aaNum[1] = dqxy.getBjpc();
                    aamap.put("value",aaNum);
                    amap.put("name",dqxy.getQymc());
                    aaList.add(aamap);
                    hzList.add(aamap);
                }
            }
        }
        map.put("A",aList);
        map.put("B",bList);
        map.put("C",cList);
        map.put("D",dList);
        map.put("AA",aaList);
        map.put("HZ",hzList);
        return map;
    }

    @Override
    @DataSource("eciq_database")
    public Integer getZaianqiye() {
        return dangqianxinyongMapper.selectZaianqiye();
    }

    @Override
    @DataSource("eciq_database")
    public Integer getBaojianqiye() {
        return dangqianxinyongMapper.selectBaojianqiye();
    }

    @Override
    @DataSource("eciq_database")
    public Integer getJinkoushouhuoqiye() {
        return dangqianxinyongMapper.selectJinkoushouhuoqiye();
    }

    @Override
    @DataSource("eciq_database")
    public Integer getChukoufahuoqiye() {
        return dangqianxinyongMapper.selectChukoufahuoqiye();
    }

    @Override
    @DataSource("eciq_database")
    public Integer getChukoushengchanqiye() {
        return dangqianxinyongMapper.selectChukoushengchanqiye();
    }

    @Override
    @DataSource("eciq_database")
    public Integer selectBYBaojiandan() {
        return dangqianxinyongMapper.selectBYBaojiandan();
    }

    @Override
    @DataSource("eciq_database")
    public Double selectBYBaojianjine() {
        DecimalFormat    df   = new DecimalFormat("######0.00");
        Double  je = (double)(dangqianxinyongMapper.selectBYBaojianjine())/100000000;
        return Double.parseDouble(df.format(je));
    }

    @Override
    @DataSource("eciq_database")
    public Integer selectBYBaojianqiye() {
        return dangqianxinyongMapper.selectBYBaojianqiye();
    }


    @Override
    @DataSource("eciq_database")
    public Double selectBjjeBfb() {
        DecimalFormat    df   = new DecimalFormat("######0.00");
        Long by = dangqianxinyongMapper.selectBjjeBy();
        Long sy = dangqianxinyongMapper.selectBjjeSy();
        Double by1= (double)(by/1000000);
        Double sy1= (double)(sy/1000000);
        Double bfb = by1*100/sy1;
        Double bfb1= Double.parseDouble(df.format(bfb));
        return bfb1;
    }

    @Override
    @DataSource("eciq_database")
    public Integer selectBYbuhegepici() {
        return dangqianxinyongMapper.selectBYbuhegepici();
    }

    @Override
    @DataSource("eciq_database")
    public Double selectBYbuhegejine() {
        DecimalFormat    df   = new DecimalFormat("######0.00");
        Double  je = (double)(dangqianxinyongMapper.selectBYbuhegejine())/100000000;
        return Double.parseDouble(df.format(je));
    }
}
