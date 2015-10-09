package com.jym.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/**
 * 容器初始化完成以后需要做一些初始化数据库的操作
 * @author huanghao
 *
 */

@Component
public class InitProcessOnContainerStart implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
	}

}
