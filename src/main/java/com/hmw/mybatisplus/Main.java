package com.hmw.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Main {
    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();

        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://106.13.136.87:3306/mybatis?useUnicode=true&characterEncoding=UTF-8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("asdfghjkl");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //拿到工程的绝对路径
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        //创建好之后文件不打开
        globalConfig.setOpen(false);
        globalConfig.setAuthor("hmw");
        //设置service名字
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);

        //包信息
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.hmw.mybatisplus");
        //模块包，在gennerator里创建下面的文件
        //packageConfig.setModuleName("generator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);

        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        //自动添加lombok注解
        strategyConfig.setEntityLombokModel(true);
        //生成部分表
        //strategyConfig.setInclude("user","product");
        //_转驼峰
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}
