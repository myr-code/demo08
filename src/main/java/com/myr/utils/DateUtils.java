package com.myr.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.utils
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-12 11:51
 * @Description: TODO
 */
public class DateUtils {

    /**
     * 01-获取当前系统日期
     * @return
     */
    public static String  getNowTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
