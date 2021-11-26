package com.chenxc.cxcbokirestful.eportal.controller.base.util;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.StringWriter;
import java.io.Writer;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/17 23:59
 */
public class JsonUtils {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String getJson(Object object)
    {
        try
        {
            Writer strWriter = new StringWriter();
            mapper.writeValue(strWriter, object);
            return strWriter.toString();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static <T> T readValue(String jsonData, Class<T> clz)
    {
        try
        {
            mapper.getDeserializationConfig().set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(jsonData, clz);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
