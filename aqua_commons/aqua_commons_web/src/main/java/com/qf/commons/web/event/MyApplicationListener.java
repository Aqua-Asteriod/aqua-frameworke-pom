package com.qf.commons.web.event;

import org.slf4j.MDC;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.StringUtils;

/**
 * @author pww
 * @date 2021/10/19
 * @apiNote
 */

public class MyApplicationListener implements GenericApplicationListener {
    @Override
    public boolean supportsEventType(ResolvableType eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType.getRawClass());
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 19;
    }

    /**
     * yml文件加载完成后执行
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        //转换成环境的事件对象
        ApplicationEnvironmentPreparedEvent environmentPreparedEvent
                = (ApplicationEnvironmentPreparedEvent) event;
        //获取当前环境信息
        ConfigurableEnvironment environment = environmentPreparedEvent.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        PropertySource<?> configurationProperties = propertySources.get("configurationProperties");

        //获取微服务的配置文件中的应用名称
        String serverName = (String) configurationProperties.getProperty("spring.application.name");
        String logName = (String) configurationProperties.getProperty("logging.file.name");
        String logPath = (String) configurationProperties.getProperty("logging.file.path");
        System.out.println(serverName);

        //封装到MDC容器中
        MDC.put("appName", StringUtils.isEmpty(logName) ? serverName : logName);
        MDC.put("appPath", StringUtils.isEmpty(logPath) ? serverName : logPath);
    }
}
