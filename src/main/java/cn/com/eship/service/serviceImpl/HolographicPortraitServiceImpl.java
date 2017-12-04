package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.ItfInsResultGoods;
import cn.com.eship.repository.HolographicPortraitMapper;
import cn.com.eship.service.HolographicPortraitService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HolographicPortraitServiceImpl implements HolographicPortraitService {

    private final HolographicPortraitMapper holographicPortraitMapper;

    @Autowired
    public HolographicPortraitServiceImpl(HolographicPortraitMapper holographicPortraitMapper) {
        this.holographicPortraitMapper = holographicPortraitMapper;
    }


    @Override
    @DataSource("eciq_database")
    public Map getJYan() {
        Map map = new HashMap();
        int [] aNum=new int[9];
        int [] bNum=new int[9];
        int [] cNum=new int[9];
        List<ItfInsResultGoods> rmbList = holographicPortraitMapper.selectJYanRmb();
        List<ItfInsResultGoods> bjpcList = holographicPortraitMapper.selectJYanBjpc();
        List<ItfInsResultGoods> qysmList = holographicPortraitMapper.selectJYanQysm();
        if(rmbList.size()>0) {
            for (ItfInsResultGoods goods:rmbList) {
                if(goods.getCname().equals("品质")){
                  aNum[0]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("数量")){
                    aNum[1]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("规格")){
                    aNum[2]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("重量")){
                    aNum[3]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("安全")){
                    aNum[4]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("卫生")){
                    aNum[5]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("包装")){
                    aNum[6]= new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("标识")){
                    aNum[7]=new Long(goods.getRmb()/10000).intValue();
                }
                if(goods.getCname().equals("环保")){
                    aNum[8]= new Long(goods.getRmb()/10000).intValue();
                }
            }
        }
        if(bjpcList.size()>0) {
            for (ItfInsResultGoods goods : bjpcList) {
                if (goods.getCname().equals("品质")) {
                    bNum[0] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("数量")) {
                    bNum[1] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("规格")) {
                    bNum[2] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("重量")) {
                    bNum[3] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("安全")) {
                    bNum[4] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("卫生")) {
                    bNum[5] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("包装")) {
                    bNum[6] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("标识")) {
                    bNum[7] = new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("环保")) {
                    bNum[8] = new Long(goods.getBjpc()).intValue();
                }
            }
        }
        if(qysmList.size()>0) {
            for (ItfInsResultGoods goods : qysmList) {
                if (goods.getCname().equals("品质")) {
                    cNum[0] = new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("数量")) {
                    cNum[1] = new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("规格")) {
                    cNum[2] = new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("重量")) {
                    cNum[3] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("安全")) {
                    cNum[4] = new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("卫生")) {
                    cNum[5] = new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("包装")) {
                    cNum[6] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("标识")) {
                    cNum[7] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("环保")) {
                    cNum[8] = new Long(goods.getQysm()).intValue();
                }
            }
        }
            map.put("rmb",aNum);
            map.put("bjpc",bNum);
            map.put("qysm",cNum);
        return map;
    }

    @Override
    @DataSource("eciq_database")
    public Map getJYi() {
        Map map = new HashMap();
        int [] aNum=new int[5];
        int [] bNum=new int[5];
        int [] cNum=new int[5];
        int [] dNum=new int[5];
        int [] eNum=new int[5];
        int [] fNum=new int[5];
        int [] rmbNum=new int[5];
        int [] bjpcNum=new int[5];
        int [] qysmNum=new int[5];
        List<ItfInsResultGoods> rmb1List = holographicPortraitMapper.selectJYiRmb1();
        List<ItfInsResultGoods> rmb2List = holographicPortraitMapper.selectJYiRmb2();
        List<ItfInsResultGoods> bjpc1List = holographicPortraitMapper.selectJYiBjpc1();
        List<ItfInsResultGoods> bjpc2List = holographicPortraitMapper.selectJYiBjpc2();
        List<ItfInsResultGoods> qysm1List = holographicPortraitMapper.selectJYiQysm1();
        List<ItfInsResultGoods> qysm2List = holographicPortraitMapper.selectJYiQysm2();
        if(rmb1List.size()>0) {
            for (ItfInsResultGoods goods : rmb1List) {
                if (goods.getCname().equals("动物检疫")) {
                    aNum[0] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    aNum[1] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    aNum[2] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    aNum[3] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    aNum[4] =new Long(goods.getRmb()/10000).intValue();
                }
            }
        }
        if(rmb2List.size()>0) {
            for (ItfInsResultGoods goods : rmb2List) {
                if (goods.getCname().equals("动物检疫")) {
                    bNum[0] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    bNum[1] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    bNum[2] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    bNum[3] =new Long(goods.getRmb()/10000).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    bNum[4] =new Long(goods.getRmb()/10000).intValue();
                }
            }
        }
        if(bjpc1List.size()>0) {
            for (ItfInsResultGoods goods : bjpc1List) {
                if (goods.getCname().equals("动物检疫")) {
                    cNum[0] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    cNum[1] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    cNum[2] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    cNum[3] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    cNum[4] =new Long(goods.getBjpc()).intValue();
                }
            }
        }
        if(bjpc2List.size()>0) {
            for (ItfInsResultGoods goods : bjpc2List) {
                if (goods.getCname().equals("动物检疫")) {
                    dNum[0] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    dNum[1] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    dNum[2] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    dNum[3] =new Long(goods.getBjpc()).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    dNum[4] =new Long(goods.getBjpc()).intValue();
                }
            }
        }
        if(qysm1List.size()>0) {
            for (ItfInsResultGoods goods : qysm1List) {
                if (goods.getCname().equals("动物检疫")) {
                    eNum[0] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    eNum[1] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    eNum[2] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    eNum[3] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    eNum[4] =new Long(goods.getQysm()).intValue();
                }
            }
        }
        if(qysm2List.size()>0) {
            for (ItfInsResultGoods goods : qysm2List) {
                if (goods.getCname().equals("动物检疫")) {
                    fNum[0] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("植物检疫")) {
                    fNum[1] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("卫生检疫")) {
                    fNum[2] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("木质包装检疫")) {
                    fNum[3] =new Long(goods.getQysm()).intValue();
                }
                if (goods.getCname().equals("其他")) {
                    fNum[4] =new Long(goods.getQysm()).intValue();
                }
            }
        }
        rmbNum[0]=aNum[0]+bNum[0];
        rmbNum[1]=aNum[1]+bNum[1];
        rmbNum[2]=aNum[2]+bNum[2];
        rmbNum[3]=aNum[3]+bNum[3];
        rmbNum[4]=aNum[4]+bNum[4];
        bjpcNum[0]=cNum[0]+dNum[0];
        bjpcNum[1]=cNum[1]+dNum[1];
        bjpcNum[2]=cNum[2]+dNum[2];
        bjpcNum[3]=cNum[3]+dNum[3];
        bjpcNum[4]=cNum[4]+dNum[4];
        qysmNum[0]=eNum[0]+fNum[0];
        qysmNum[1]=eNum[1]+fNum[1];
        qysmNum[2]=eNum[2]+fNum[2];
        qysmNum[3]=eNum[3]+fNum[3];
        qysmNum[4]=eNum[4]+fNum[4];
        map.put("rmb",rmbNum);
        map.put("qysm",qysmNum);
        map.put("bjpc",bjpcNum);
        return map;
    }

}
