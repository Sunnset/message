package org.luoyu.core.interceptor;

import org.luoyu.core.constant.LogConstant;
import org.luoyu.utils.IdUtils;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * servlet请求处理日志添加日志标识
 */
public class LogTraceInterceptor implements HandlerInterceptor {

    /**
     * 请求处理前添加日志标识
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String traceId = request.getHeader(LogConstant.TRACE_ID);
        if (Objects.isNull(traceId) || traceId.trim().length() == 0) {
            traceId = IdUtils.snowflake();
        }
        MDC.put(LogConstant.TRACE_ID, traceId);
        return true;
    }

    /**
     * 请求处理完成移除日志标识
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        MDC.remove(LogConstant.TRACE_ID);
    }
}
