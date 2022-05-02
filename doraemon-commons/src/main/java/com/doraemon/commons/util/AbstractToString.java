package com.doraemon.commons.util;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Description:数据库基础字段
 * @author GGH
 * @date 2022年05月02日 18:14
 * @since 1.0
 */
public abstract class AbstractToString implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
