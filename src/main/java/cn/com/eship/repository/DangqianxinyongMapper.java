package cn.com.eship.repository;

import cn.com.eship.models.Dangqianxinyongxinxi;

import java.util.List;

public interface DangqianxinyongMapper {
  List<Dangqianxinyongxinxi>  selectDangqianxinyong();
  Integer  selectZaianqiye();
  Integer  selectBaojianqiye();
  Integer  selectJinkoushouhuoqiye();
  Integer  selectChukoufahuoqiye();
  Integer  selectChukoushengchanqiye();
}
