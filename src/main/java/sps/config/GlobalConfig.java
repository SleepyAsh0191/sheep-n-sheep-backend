package sps.config;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import sps.entity.MapData;

import java.util.HashMap;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/16 8:01
 */
@Configuration
public class GlobalConfig {
    @Value("${sheep.hard-code}")
    public boolean hardCode;

    @Value("${topic.id}")
    public int topicId;
    @Value("${topic.name}")
    public String topicName;

    public static HashMap<Integer, MapData> gameMap = new HashMap<>();

    public int requested = 0;


}
