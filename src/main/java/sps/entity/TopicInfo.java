package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 22:41
 */
@Data
public class TopicInfo {
    String nick_name = "";
    String avatar = "";
    Integer uid = 0;
    Integer state = 0;
    Integer time = 0;
    Integer ts = 0;
    Integer fail = 0;
    Integer type = 0;
    String city = "";
}
