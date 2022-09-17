package sps.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/17 11:12
 */
@Data
public class RankInfo {
    RankUser user = new RankUser();
    List<?> list = new ArrayList<>();
}
