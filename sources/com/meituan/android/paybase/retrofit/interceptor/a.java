package com.meituan.android.paybase.retrofit.interceptor;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.o;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @NonNull
    public static Map<String, String> a(ak akVar) throws IOException {
        String[] split;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b784d64ecb4f128a2b52f76228c42a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b784d64ecb4f128a2b52f76228c42a1");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c cVar = new c();
        cVar.s();
        if (akVar != null) {
            akVar.writeTo(cVar.b());
            String p = cVar.p();
            if (!TextUtils.isEmpty(p)) {
                for (String str : p.split("&")) {
                    if (!"=".equals(str.trim())) {
                        String[] split2 = str.split("=");
                        if (split2.length == 1) {
                            linkedHashMap.put(URLDecoder.decode(split2[0]), null);
                        } else {
                            linkedHashMap.put(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                        }
                    }
                }
            }
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    @NonNull
    public static ak a(@NonNull Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfe9635aa269be6dd365c09e033fa311", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfe9635aa269be6dd365c09e033fa311");
        }
        o.a aVar = new o.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue() == null ? "" : entry.getValue());
        }
        return aVar.a();
    }
}
