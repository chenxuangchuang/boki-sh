package com.chenxc.cxcboki.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/12/30 11:15
 */
public class BeanUtil {

    public static void copyBeanNoCover (Object src, Object tgt) throws Exception {
        PropertyDescriptor[] tgtPDs = BeanUtils.getPropertyDescriptors(tgt.getClass());
        String[] ignores = new String[tgtPDs.length];
        int cnt = 0;
        for (PropertyDescriptor descriptor : tgtPDs) {
            String name = descriptor.getName();
            Object value = descriptor.getReadMethod().invoke(tgt);
            if (StringUtils.hasText(ObjectUtils.getDisplayString(value))) {
                ignores[cnt] = name;
                cnt++;
            }
        }
        BeanUtils.copyProperties(src, tgt, ignores);
    }
}
