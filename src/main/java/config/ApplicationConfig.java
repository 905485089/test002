package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
/**
 * 应用配置(Spring配置) == xml文件
 * 
 */
@Configuration
@ComponentScan({"dao","service","util"})
//-- 启动Spring的AOP功能
@EnableAspectJAutoProxy
@Import(JdbcConfig.class)
public class ApplicationConfig {
	
}