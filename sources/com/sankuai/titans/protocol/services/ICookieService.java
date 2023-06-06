package com.sankuai.titans.protocol.services;

import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ICookieService {
    public static final String EMPTY_COOKIE_TAG = "TITANS_COOKIE_EMPTY_VALUE";

    String getCookieValue(String str);

    Set<String> getSupportDomains(String str);

    Set<String> getSupportKeys();
}
