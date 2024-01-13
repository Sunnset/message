package org.luoyu.sdk.channel.dingding;

import lombok.Data;

@Data
public class DingMessage {
    /**
     * 消息标识
     */
    private String title;
    /**
     * 消息类型
     */
    private String messageType;

    private String content;

    private Boolean atAll = Boolean.FALSE;

    private String atMobile;


    private String atUserId;



}
