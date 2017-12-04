package cn.com.eship.repository;

import cn.com.eship.models.EnterpriseType;
import cn.com.eship.models.ItfInsResultGoods;

import java.util.List;

public interface EnterpriseTypeMapper {
    List<EnterpriseType> selectEnterpriseType();
    Integer  selectQyzsl();

}
