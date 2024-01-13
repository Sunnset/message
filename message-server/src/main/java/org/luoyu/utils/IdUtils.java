package org.luoyu.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class IdUtils {

    private static final Snowflake SNOWFLAKE = IdUtil.getSnowflake();

    public static String snowflake(){
        return SNOWFLAKE.nextIdStr();
    }

}
