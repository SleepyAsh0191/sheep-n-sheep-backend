package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 21:59
 */
@Data
public class UserInfo {
    String id = "6322824c4f8b51b7399c4f2f";
    String created_at = "2022-09-15T01:39:24.708Z";
    String updated_at = "2022-09-15T01:39:24.708Z";
    Integer role = 2;
    Integer uid = 114514;
    String nick_name = "田所浩二";
    String avatar = "http://127.0.0.1:5500/YJSNPI.png";
    String wx_open_id = "YJSNPI";
    String wx_union_id = "YJSNPI";
    String last_login_time = null;
    String last_logout_time = null;
    Integer change_first_time = 0;
    Integer change_last_time = 0;
    Integer change_total = 0;
    Integer change_times = 0;
}
