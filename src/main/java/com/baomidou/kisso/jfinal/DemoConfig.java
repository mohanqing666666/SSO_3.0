
package com.baomidou.kisso.jfinal;

import com.baomidou.kisso.plugin.KissoJfinalPlugin;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.druid.DruidPlugin;

/**
 * 配置
 */
public class DemoConfig extends JFinalConfig {
	static Prop p;
	/**
	 * 配置常量
	 */
	@Override
	public void configConstant(Constants arg0) {
		arg0.setDevMode(true);
		PropKit.use("config.properties");
	}

	/**
	 * 配置处理器
	 */
	@Override
	public void configHandler(Handlers arg0) {
         
	}

	/**
	 * 配置全局拦截器
	 */
	@Override
	public void configInterceptor(Interceptors arg0) {

	}

	/**
	 * 配置插件
	 */
	@Override
	public void configPlugin(Plugins plugins) {
		//kisso 初始化
		plugins.add(new KissoJfinalPlugin());
		//创建数据库连接插件
		DruidPlugin dp = new DruidPlugin(PropKit.get("db.jdbcUrl").trim(), PropKit.get("db.user").trim(), 
				PropKit.get("db.password").trim(), PropKit.get("db.driver").trim());
		plugins.add(dp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		  // 显示SQL语句
        arp.setShowSql(true);
        plugins.add(arp);
		//设置小写 //默认为fasle大写
		//arp.setContainerFactory(new CaseInsensitiveContainerFactory(true));
//		arp.setContainerFactory(new CaseInsensitiveExtends(true));
//		//添加表与实体的映射
////		_MappingKit.mapping(arp);
//		plugins.add(arp);
//		//配置控制反转插件
//		plugins.add(new IocPlugin());
		
		
	}
	/**
	 * 配置路由
	 */
	@Override
	public void configRoute(Routes me) {
//		me.add("/", IndexController.class, "/demo");
		me.add("/login", LoginController.class, "/demo");
		me.add("/logout", LogoutController.class,"/demo");
		me.add("/verify", VerifyCodeController.class);
	}

}
