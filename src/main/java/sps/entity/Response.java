package sps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 15:38
 */
@Data
@AllArgsConstructor
public class Response<T> {
    Integer err_code;
    String err_msg;
    T data;
}
