package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.BaseDict;

public interface BaseDictService {
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}
