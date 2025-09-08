package org.acme.CustomTask.config;
import org.kie.kogito.process.WorkItemHandlerConfig;
import org.kie.kogito.process.impl.DefaultWorkItemHandlerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomWorkItemHandlerConfig {

    @Bean
    public WorkItemHandlerConfig workItemHandlerConfig() {
        DefaultWorkItemHandlerConfig config = new DefaultWorkItemHandlerConfig();
        config.register("CustomTask", new CustomTaskWorkItemHandler());
        return config;
    }
}