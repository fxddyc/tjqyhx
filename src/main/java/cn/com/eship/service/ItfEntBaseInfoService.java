package cn.com.eship.service;

import cn.com.eship.models.ItfEntBaseInfo;

import java.util.List;
import java.util.Map;

public interface ItfEntBaseInfoService {
    Map getItfEntBaseInfo(String str);
    ItfEntBaseInfo selectItfEntBaseInfoByZzjgdm(String zzjgdm);
}
