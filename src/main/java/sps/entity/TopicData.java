package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 22:40
 */
@Data
public class TopicData {
    String name = "狼人#吸血鬼";
    Integer id = 2;
    String ts = "20220917";
    Integer tomb = 0;
    Integer taoist = 0;
    TopicInfo info;
}
