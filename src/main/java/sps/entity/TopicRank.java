package sps.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/17 11:23
 */
@Data
public class TopicRank {
    List<?> tomb = new ArrayList<>();
    List<?> taoist = new ArrayList<>();
    Integer tomb_fail_count = 1234;
    Integer tomb_fail_member = 1235;
    Integer taoist_fail_count = 1224;
    Integer taoist_fail_member = 1134;
}
