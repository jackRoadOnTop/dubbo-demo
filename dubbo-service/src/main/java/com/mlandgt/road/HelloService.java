package com.mlandgt.road;

import java.util.List;
import java.util.Map;

/**
 * @author Road
 */
public interface HelloService {
    /**
     * 获取提供者数据
     *
     * @return
     */
    String say();

    /**
     * List集合
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> testMapList(Map<String, Object> map);
}
