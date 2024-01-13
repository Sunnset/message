package org.luoyu.sdk.channel.dingding;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.luoyu.sdk.channel.AbstractMessageConfig;

/**
 * 钉钉群聊机器人配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DingClientChatRobotConfig extends AbstractMessageConfig {

    /**
     * 消息关键字
     */
    public static final Integer SECURITY_KEYWORD = 1;
    /**
     * 加签
     */
    public static final Integer SECURITY_SECRET = 2;
    /**
     * IP地址段
     */
    public static final Integer SECURITY_IP = 3;


    private String accessToken;
    /**
     * 群机器人安全模式
     */
    private Integer securityMode;
    /**
     * 加签秘钥
     */
    private String secretKey;

    public DingClientChatRobotConfig(String accessToken) {

    }

}
