package com.liuaiqing.config;

import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.i18n.LocaleContextResolver;

public class MyLocaleContextResolver implements LocaleContextResolver {

    @Override
    public LocaleContext resolveLocaleContext(ServerWebExchange exchange) {
        return null;
    }

    @Override
    public void setLocaleContext(ServerWebExchange exchange, LocaleContext localeContext) {

    }
}
