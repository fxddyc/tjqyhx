package cn.com.eship.service.serviceImpl;

import cn.com.eship.models.EnterpriseType;
import cn.com.eship.models.ItfInsResultGoods;
import cn.com.eship.repository.EnterpriseTypeMapper;
import cn.com.eship.repository.HolographicPortraitMapper;
import cn.com.eship.service.EnterpriseTypeService;
import cn.com.eship.springUtil.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EnterpriseTypeServiceImpl implements EnterpriseTypeService {

    private final EnterpriseTypeMapper enterpriseTypeMapper;
    private final HolographicPortraitMapper holographicPortraitMapper;

    @Autowired
    public EnterpriseTypeServiceImpl(EnterpriseTypeMapper enterpriseTypeMapper, HolographicPortraitMapper holographicPortraitMapper) {
        this.enterpriseTypeMapper = enterpriseTypeMapper;
        this.holographicPortraitMapper = holographicPortraitMapper;
    }

    @Override
    @DataSource("eciq_database")
    public Map getEnterpriseType() {
        Map map = new HashMap();
        List<EnterpriseType> list = enterpriseTypeMapper.selectEnterpriseType();
        if (list.size() > 0) {
            String[] str = new String[list.size()];
            int[] num = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                str[i] = list.get(i).getLx();
                num[i] = list.get(i).getQysl();
            }
            map.put("qysl", num);
            map.put("lx", str);
        }
        return map;
    }

    @Override
    @DataSource("eciq_database")
    public Map selectQyzsl() {
        Map map = new HashMap();
        List<EnterpriseType> list = enterpriseTypeMapper.selectEnterpriseType();
        int zs = enterpriseTypeMapper.selectQyzsl();
        Double zs1 = (double) zs;
        if (list.size() > 0) {
            List list1 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Map map1 = new HashMap();
                Double qysl = (double) list.get(i).getQysl();
                map1.put("name", list.get(i).getLx());
                map1.put("y", (qysl / zs1));
                map1.put("sliced", true);
                map1.put("selected", true);
                list1.add(map1);
            }

            map.put("zb", list1);
        }
        return map;
    }

    @Override
    @DataSource("eciq_database")
    public Map selectDyfb() {
        Map map = new HashMap();
        int b = 0;
        List<ItfInsResultGoods> list = holographicPortraitMapper.selectDyfb();
        if (list.size() > 0) {
            String[] str = new String[10];
            int[] num = new int[10];
            for (int i = 0; i < 9; i++) {
                str[i] = list.get(i).getDm();
                num[i] = (int) list.get(i).getQysm();
            }
            for(int a=9;a<list.size();a++){
                b=b+(int)list.get(a).getQysm();
            }
            str[9]="其他";
            num[9]=b;
            map.put("qysm", num);
            map.put("dm", str);
        }
        return map;
    }

    @Override
    @DataSource("eciq_database")
    public Map getDyfbzb() {
        Map map = new HashMap();
        Double zs = 0.00;
        Double qt=0.00;
        List<ItfInsResultGoods> list = holographicPortraitMapper.selectDyfb();
        if (list.size() > 0) {
            List list1 = new ArrayList();
            for(int i=0;i<list.size();i++){
                zs=zs+(double)list.get(i).getQysm();
            }
            for(int b=9;b<list.size();b++){
                qt=qt+(double)list.get(b).getQysm();
            }
            for(int a = 0;a <=9; a++){
                Map map1 = new HashMap();
                if(a<9) {
                    Double qysm = (double) list.get(a).getQysm();
                    map1.put("name", list.get(a).getDm());
                    map1.put("y", (qysm / zs));
                    map1.put("sliced", true);
                    map1.put("selected", true);
                    list1.add(map1);
                }
                if(a==9){
                    map1.put("name", "其他");
                    map1.put("y", (qt / zs));
                    map1.put("sliced", true);
                    map1.put("selected", true);
                    list1.add(map1);
                }
            }
            map.put("zb", list1);
        }

        return map;
    }
}
