package com.zhuchuanxiao.makefine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhuchuanxiao.makefine.IDao.DesignerMapper;
import com.zhuchuanxiao.makefine.entity.Designer;
import com.zhuchuanxiao.makefine.service.DesignerService;

@Component
public class DesignerServiceImpl implements DesignerService{

	@Autowired
    private DesignerMapper designerMapper;
	
	
	@Override
	public void insertDesigner(Designer designer) {
		designerMapper.insert(designer);
	}

}
