package sps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 15:41
 */
@Data
@AllArgsConstructor
public class UserRankInfo {
    String region;
    User user;
}
