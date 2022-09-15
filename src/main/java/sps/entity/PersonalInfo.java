package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 22:11
 */
@Data
public class PersonalInfo {
    Integer register_time = 1663205964;
    String avatar = "http://127.0.0.1:5500/YJSNPI.png";
    String nick_name =  "田所浩二";
    Integer challenge = 63;
    Integer uid = 114514;
    Integer daily_count = 721;
    Integer topic_count = 364364;
    Integer today_state = 1;
    Integer today_ts = Math.toIntExact(System.currentTimeMillis() / 1000);
    Integer today_time = 114514;
    Integer today_fail_count = 1919810;
    Integer skin = 14;
}
