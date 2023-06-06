package com.meituan.android.common.statistics.network;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LXCookieManager extends CookieManager {
    private static final Map<String, List<String>> EMPTY = Collections.emptyMap();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa6f579e1684831d3305421b31c752ff", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa6f579e1684831d3305421b31c752ff") : getValidCookies(super.get(uri, map));
    }

    @NonNull
    public static Map<String, List<String>> getValidCookies(Map<String, List<String>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "182cc2896d8beb904c4e65bae6c9341e", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "182cc2896d8beb904c4e65bae6c9341e");
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (entry.getValue().isEmpty()) {
                    continue;
                } else {
                    for (String str : entry.getValue()) {
                        try {
                            check(str);
                        } catch (IllegalArgumentException unused) {
                            return EMPTY;
                        }
                    }
                    continue;
                }
            }
        }
        return map;
    }

    private static void check(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "565a10b66d2bf4bff721b197aa520b41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "565a10b66d2bf4bff721b197aa520b41");
        } else if (str == null) {
            throw new IllegalArgumentException("name == null");
        } else {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        }
    }
}
