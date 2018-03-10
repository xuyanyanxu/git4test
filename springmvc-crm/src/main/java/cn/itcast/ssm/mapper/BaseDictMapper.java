package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.BaseDict;

public interface BaseDictMapper {
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}
