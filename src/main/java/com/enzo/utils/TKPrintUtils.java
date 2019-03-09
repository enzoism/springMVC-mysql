package com.enzo.utils;

import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// 日志打印工具类，便于控制台调试
public class TKPrintUtils {

    // list对象快速打印
    public static <T> void printList(Collection<T> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {//如果没值的时候返回-1 就是false停止循环
                System.out.println("---TKPrintUtils---List:" + iterator.next());
            }
        }else{
            System.out.println("---TKPrintUtils---List:" + "打印List为空");
        }
    }

    // map对象快速打印
    public static <T> void printMap(Map<String, T> map) {
        if (MapUtils.isNotEmpty(map)) {
            Iterator<Map.Entry<String, T>> iterator = map.entrySet().iterator();
            Map.Entry<String, T> printMap = null;
            while (iterator.hasNext()) {//如果没值的时候返回-1 就是false停止循环
                printMap = iterator.next();
                System.out.println("---TKPrintUtils---Key:" + printMap.getKey() + "---Value:" + printMap.getValue());
            }
        }else{
            System.out.println("---TKPrintUtils---Map:" + "打印Map为空");
        }
    }

    // object对象快速打印
    public static void printObject(Object object) {
        if (null != object){
            String string = null;
            if (object.getClass().equals(String.class)){
                string = object.toString();
            }else{
                JSONObject jsonObject = JSONObject.fromObject(object);
                string = jsonObject.toString();
            }
            System.out.println("---TKPrintUtils---Object:" + string);
        }else{
            System.out.println("---TKPrintUtils---Object:" + "打印Object为空");
        }
    }


}
