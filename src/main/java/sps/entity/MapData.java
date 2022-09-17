package sps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 12:58
 */
@Data
@AllArgsConstructor
public class MapData {
    String id;
    Integer map_id;
    String updated_at;
    String map_data;
    String created_at;
}
