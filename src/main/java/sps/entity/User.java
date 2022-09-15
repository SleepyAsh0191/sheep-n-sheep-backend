package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 15:42
 */
@Data
public class User {
    Integer state = 2;
    Integer first = 0;
    Integer uid = 114514;
    String nickname = "田所浩二";
    Integer time = 114514;
    String avatar = "http://127.0.0.1:5500/YJSNPI.png";
    Integer skin = 1;
    String city = "下北泽";
    String region = "东京都";
    Integer role = 2;
    Integer ts = Math.toIntExact(System.currentTimeMillis()/1000);
    Integer fail = 114514;
    Integer gender = 0;
}
