package com.myr.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.utils
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-10 18:59
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResults {

    private Integer code; //状态码
    private String message; //消息内容
    private Object data; //返回数据
}
