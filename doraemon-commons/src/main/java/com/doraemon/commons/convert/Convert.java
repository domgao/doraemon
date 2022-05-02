package com.doraemon.commons.convert;


import org.apache.commons.collections4.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description:通用转化器
 * @author GGH
 * @date 2022年03月06日 0:18
 * @since 1.0
 */
public class Convert<F,T> {

    private Function<F,T> function;

    public Convert(Function<F,T> function){
        this.function = function;
    }

    public T convert(F from){
        if(from == null){
            return null;
        }
        return function.apply(from);
    }

    public List<T> convert(List<F> fromList){
        if(CollectionUtils.isEmpty(fromList)){
            return new ArrayList<T>();
        }
        return fromList.stream().map(this::convert).collect(Collectors.toList());
    }

}
