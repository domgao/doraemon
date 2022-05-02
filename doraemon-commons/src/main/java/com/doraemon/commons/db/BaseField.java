package com.doraemon.commons.db;

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
public abstract class BaseField implements Serializable {

    /*主键Id*/
    private Long id;

    /*创建时间*/
    private LocalDateTime createTime;

    /*修改时间*/
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
