package sps;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import sps.config.GlobalConfig;
import sps.entity.MapData;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/16 8:30
 */
public class IDKWhatIsUtil {

    public String getMapData() throws IOException, URISyntaxException {
        //return restTemplate.getForObject("https://cat-match.easygame2021.com/admin/game_map/page", String.class);
        Resource resource = new ClassPathResource("game_map.json");
        URL map = resource.getURL();
        return new String(Files.readAllBytes(Paths.get(map.toURI())));
    }

    //已备份数据，但是此接口可能会和谐
    public void updateData() throws IOException, URISyntaxException {
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
