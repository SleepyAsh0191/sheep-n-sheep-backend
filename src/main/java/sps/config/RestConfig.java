package sps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/6 8:40
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
