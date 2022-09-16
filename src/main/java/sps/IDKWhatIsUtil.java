package sps;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.web.client.RestTemplate;
import sps.config.GlobalConfig;
import sps.entity.MapData;

import javax.annotation.Resource;
import java.util.Calendar;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/16 8:30
 */
public class IDKWhatIsUtil {
    @Resource
    RestTemplate restTemplate = new RestTemplate();

    public String getMapData() {
        return restTemplate.getForObject("https://cat-match.easygame2021.com/admin/game_map/page", String.class);
    }

    //已备份数据，但是此接口可能会和谐
    public void updateData() {
        Calendar cal = Calendar.getInstance();
        //一天一变，只记录日即可
        int day = cal.get(Calendar.DATE);
        if(GlobalConfig.requested == day) return;
        GlobalConfig.requested = day;
        if (!GlobalConfig.hardCode) {
            String mapData = getMapData();
            JsonObject json = new Gson().fromJson(mapData, JsonObject.class);
            JsonArray dataArray = json.getAsJsonArray("data");
            for (JsonElement e : dataArray) {
                GlobalConfig.gameMap.put(e.getAsJsonObject().get("map_id").getAsInt(), new Gson().fromJson(e, MapData.class));
            }
        }
    }
}
