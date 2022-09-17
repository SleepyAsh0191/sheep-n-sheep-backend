package sps.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import sps.config.GlobalConfig;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 22:40
 */
@Data
public class TopicData {
    String name = "僵尸#道士";
    Integer id = 0;
    String ts = "20220917";
    Integer tomb = 0;
    Integer taoist = 0;
    TopicInfo info;
}
