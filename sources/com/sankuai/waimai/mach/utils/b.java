package com.sankuai.waimai.mach.utils;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c84595eaab303fd46d7db4aed872d5cc", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c84595eaab303fd46d7db4aed872d5cc") : new GsonBuilder().create();
    }

    public static Map<String, Object> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0996a98991df45e9efd76691b115dd71", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0996a98991df45e9efd76691b115dd71");
        }
        try {
            return (Map) new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().fromJson(str, (Class<Object>) Map.class);
        } catch (Exception unused) {
            return new HashMap();
        }
    }
}
