package com.meituan.android.customerservice.kit.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends CookieManager {
    public static ChangeQuickRedirect a;
    private static final Map<String, List<String>> b = Collections.emptyMap();

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53508eb605e802a72ee6df08804c105", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53508eb605e802a72ee6df08804c105") : a(super.get(uri, map));
    }

    @NonNull
    private static Map<String, List<String>> a(Map<String, List<String>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312f98dd022ac8bf2e3e38c1c6e1acff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312f98dd022ac8bf2e3e38c1c6e1acff");
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (entry.getValue().isEmpty()) {
                    continue;
                } else {
                    for (String str : entry.getValue()) {
                        try {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e569237c9e52fe2cb2168ea47aaab7ba", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e569237c9e52fe2cb2168ea47aaab7ba");
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
                                continue;
                            }
                        } catch (IllegalArgumentException unused) {
                            return b;
                        }
                    }
                    continue;
                }
            }
        }
        return map;
    }
}
