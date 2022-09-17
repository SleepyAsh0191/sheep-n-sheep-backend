package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/17 11:10
 */
@Data
public class RankUser {
    Integer index = 0;
    UserItem item = new UserItem();
}
