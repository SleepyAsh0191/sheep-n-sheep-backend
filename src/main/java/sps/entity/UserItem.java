package sps.entity;

import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/17 11:11
 */
@Data
public class UserItem {
    String name = "名字";
    String pinyin = "mingzi";
    Integer win_score = 114;
    Integer fail_score = 514;
    Integer all_score = win_score + fail_score;
    String result = "";
}
