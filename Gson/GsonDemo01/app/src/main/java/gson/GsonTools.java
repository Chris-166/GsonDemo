package gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 利用Gson时不存在Key,使用泛型和反射机制
 * Created by FanFF on 2016/2/9.
 */
public class GsonTools {
    public GsonTools() {
    }

    /**
     * 不管客户端传递的数据类型，只要保证服务器和客户端所用的类型一致即可
     * 例如：{"person":{"address":"beijing","id":1001,"name":"jack"}}
     * @param jsonString
     * @param cla
     * @param <T>
     * @return
     */
    public static <T> T getPerson(String jsonString, Class<T>cla){
        T t = null;
        Gson gson = new Gson();
        t = gson.fromJson(jsonString, cla);
        return t;
    }

    /**
     * 使用Gson解析List<Person>
     * {"persons":[{"address":"beijing","id":1001,"name":"Smith"},{"address":"shanghai","id":1002,"name":"David"}]}
     * @param jsonString
     * @param cla
     * @param <T>
     * @return
     */
    public static <T> List<T> getPersons(String jsonString, Class<T>cla){
        List<T> list = new ArrayList<T>();
        Gson gson = new Gson();
        // TypeToken是google提供的反射机制，避免像纯粹的JSON解析时复杂的迭代与set类属性
        list = gson.fromJson(jsonString, new TypeToken<List<T>>(){}.getType());//TypeToken利用反射机制
        return list;
    }

    /**
     * {"liststring":["beijing","shanghai","guangzhou"]}
     * @param jsonString
     * @return
     */
    public static List<String> getList(String jsonString){
        List<String> list = new ArrayList<>();
        Gson gson = new Gson();
        list = gson.fromJson(jsonString, new TypeToken<List<String>>(){}.getType());
        return list;
    }

    /**
     * {"listmap":[{"id":1001,"address":"beijing","name":"Smith"},{"id":1002,"address":"David","name":"David"}]}
     * @param jsonString
     * @return
     */
    public static List<Map<String, Object>>listKeyMaps(String jsonString){
        List<Map<String, Object>>list = new ArrayList<Map<String, Object>>();
        Gson gson = new Gson();
        list = gson.fromJson(jsonString, new TypeToken<List<Map<String, Object>>>(){}.getType());
        return list;
    }

}