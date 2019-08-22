package com.baomidou.kisso.plugin;

import javax.sql.DataSource;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.druid.DruidPlugin;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * 在数据库表有任何变动时，运行一下 main 方法，极速响应变化进行代码重构
 */
public class _JFinalDemoGenerator {
	
	
	public static DataSource getDataSource() {
		PropKit.use("config.properties");
		DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("db.jdbcUrl").trim(), PropKit.get("db.user").trim(), 
				PropKit.get("db.password").trim(), PropKit.get("db.driver").trim());
		druidPlugin.start();
		return druidPlugin.getDataSource();
	}
	
//	public static void main(String[] args) {
//		// base model 所使用的包名
//				String baseModelPackageName = "com.baomidou.kisso.dao.base";
//				// base model 文件保存路径
//
//				// base model 文件保存路径，maven 项目使用
//				 String baseModelOutputDir = PathKit.getWebRootPath() + "/src/main/java/com/baomidou/kisso/dao/base";
//				// model 所使用的包名 (MappingKit 默认使用的包名)
//				String modelPackageName = "com.baomidou.kisso.dao";
//				// model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
//				String modelOutputDir = baseModelOutputDir + "/..";
//				
//				// 创建生成器
////				Generator generator = new Generator(getDataSource(), baseModelPackageName, baseModelOutputDir, modelPackageName, modelOutputDir);
//				
//				// 配置是否生成备注
//				generator.setGenerateRemarks(true);
//				
//				// 设置数据库方言
//				generator.setDialect(new MysqlDialect());
//				
//				// 设置是否生成链式 setter 方法
//				generator.setGenerateChainSetter(false);
//				
//				// 添加不需要生成的表名
//				generator.addExcludedTable("adv");
//				
//				// 设置是否在 Model 中生成 dao 对象
//				generator.setGenerateDaoInModel(false);
//				
//				// 设置是否生成字典文件
//				generator.setGenerateDataDictionary(false);
//				
//				// 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
//				generator.setRemovedTableNamePrefixes("t_");
//				
//				// 生成
//				generator.generate();
//	}
}




