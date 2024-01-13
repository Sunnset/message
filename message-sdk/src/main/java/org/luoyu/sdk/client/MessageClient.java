package org.luoyu.sdk.client;

import lombok.Data;
import org.luoyu.sdk.channel.AbstractMessageConfig;

import java.io.Serializable;
import java.util.UUID;


@Data
public final class MessageClient implements Serializable {

    /**
     * 消息渠道配置
     */
    private AbstractMessageConfig messageConfig;




    public MessageClient(){

    }


}
