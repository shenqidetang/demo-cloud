package com.tang.common.web.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/24 19:30
 */
@Component
public class RequestOriginParserDefinition implements RequestOriginParser {
    // 获取调用方标识信息并返回
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String serviceName = request.getHeader("serviceName");
        StringBuffer url = request.getRequestURL();
//        if (url.toString().endsWith("favicon.ico")) {
//            // 浏览器会向后台请求favicon.ico图标
//            return serviceName;
//        }
//
//        if (StringUtils.isEmpty(serviceName)) {
//            throw new IllegalArgumentException("serviceName must not be null");
//        }

        return serviceName;
    }
}
