package com.facebook.react.modules.network;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.platform.Platform;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements CookieJar {
    private final CookieHandler a;

    public e(CookieHandler cookieHandler) {
        this.a = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        String sb;
        if (this.a != null) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                if (cookie == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cookie.name());
                    sb2.append('=');
                    sb2.append(cookie.value());
                    if (cookie.persistent()) {
                        if (cookie.expiresAt() == Long.MIN_VALUE) {
                            sb2.append("; max-age=0");
                        } else {
                            sb2.append("; expires=");
                            sb2.append(HttpDate.format(new Date(cookie.expiresAt())));
                        }
                    }
                    if (!cookie.hostOnly()) {
                        sb2.append("; domain=");
                        sb2.append(CommonConstant.Symbol.DOT);
                        sb2.append(cookie.domain());
                    }
                    sb2.append("; path=");
                    sb2.append(cookie.path());
                    if (cookie.secure()) {
                        sb2.append("; secure");
                    }
                    if (cookie.httpOnly()) {
                        sb2.append("; httponly");
                    }
                    sb = sb2.toString();
                }
                arrayList.add(sb);
            }
            try {
                this.a.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException e) {
                Platform platform = Platform.get();
                platform.log(5, "Saving cookies failed for " + httpUrl.resolve("/..."), e);
            }
        }
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        try {
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : this.a.get(httpUrl.uri(), Collections.emptyMap()).entrySet()) {
                String key = entry.getKey();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    if (!entry.getValue().isEmpty()) {
                        for (String str : entry.getValue()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll(a(httpUrl, str));
                        }
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException e) {
            Platform platform = Platform.get();
            platform.log(5, "Loading cookies failed for " + httpUrl.resolve("/..."), e);
            return Collections.emptyList();
        }
    }

    private static List<Cookie> a(HttpUrl httpUrl, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int delimiterOffset = Util.delimiterOffset(str, i, length, ";,");
            int delimiterOffset2 = Util.delimiterOffset(str, i, delimiterOffset, '=');
            String trimSubstring = Util.trimSubstring(str, i, delimiterOffset2);
            if (!trimSubstring.startsWith(CommonConstant.Symbol.DOLLAR)) {
                String trimSubstring2 = delimiterOffset2 < delimiterOffset ? Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset) : "";
                if (trimSubstring2.startsWith(CommonConstant.Symbol.DOUBLE_QUOTES) && trimSubstring2.endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
                    trimSubstring2 = trimSubstring2.substring(1, trimSubstring2.length() - 1);
                }
                arrayList.add(new Cookie.Builder().name(trimSubstring).value(trimSubstring2).domain(httpUrl.host()).build());
            }
            i = delimiterOffset + 1;
        }
        return arrayList;
    }
}
