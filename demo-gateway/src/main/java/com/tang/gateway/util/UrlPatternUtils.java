package com.tang.gateway.util;

import cn.hutool.core.util.StrUtil;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;


/**
 * @description: patterUrl是设置的路径 requestUrl是传过来的路径   匹配路径
 * @author: tzq
 * @time: 2023/6/19 21:30
 */
public class UrlPatternUtils {
    public static boolean match(String patterUrl, String requestUrl) {
        if (StrUtil.isBlank(patterUrl) || StrUtil.isBlank(requestUrl)){
            return true;
        }
        PathMatcher matcher = new AntPathMatcher();
        return matcher.match(patterUrl,requestUrl);
    }
}
