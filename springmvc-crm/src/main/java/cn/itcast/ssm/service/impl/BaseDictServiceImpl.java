package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.BaseDictMapper;
import cn.itcast.ssm.po.BaseDict;
import cn.itcast.ssm.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	/* (non-Javadoc)
	 * 根据条件查询
	 */
	@Override
	public List<BaseDict> queryBaseDictByTypeCode(String typeCode) {
		return baseDictMapper.queryBaseDictByTypeCode(typeCode);
	}

}



















