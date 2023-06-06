package com.sankuai.meituan.kernel.net.okhttp3;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
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
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements CookieJar {
    public static ChangeQuickRedirect a;
    private final CookieHandler b;

    public a(CookieHandler cookieHandler) {
        Object[] objArr = {cookieHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1af70be924d49e568df45902b0b5e28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1af70be924d49e568df45902b0b5e28");
        } else {
            this.b = cookieHandler;
        }
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        String sb;
        int i = 2;
        byte b = 1;
        Object[] objArr = {httpUrl, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7fee151e108783f5fa26635027a7daa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7fee151e108783f5fa26635027a7daa");
        } else if (this.b != null) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = cookie;
                objArr2[b] = Byte.valueOf(b);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4553a5036611ecbebd80636a106c4a6", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4553a5036611ecbebd80636a106c4a6");
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
                i = 2;
                b = 1;
            }
            try {
                this.b.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        Object[] objArr = {httpUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cb9096fff85f10dd971b2843ba5900", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cb9096fff85f10dd971b2843ba5900");
        }
        try {
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : this.b.get(httpUrl.uri(), Collections.emptyMap()).entrySet()) {
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
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    private List<Cookie> a(HttpUrl httpUrl, String str) {
        int i = 0;
        Object[] objArr = {httpUrl, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4e9d7539fc2000e3a423f0bd5f8aac", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4e9d7539fc2000e3a423f0bd5f8aac");
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
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
