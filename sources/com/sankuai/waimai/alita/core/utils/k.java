package com.sankuai.waimai.alita.core.utils;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c66b99d6c95cea2e600e881707688088", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c66b99d6c95cea2e600e881707688088") : new GsonBuilder().create();
    }

    public static Map<String, Object> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3149e22719a6bcfb12ad158558586e35", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3149e22719a6bcfb12ad158558586e35");
        }
        try {
            return (Map) new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().fromJson(str, (Class<Object>) Map.class);
        } catch (Exception unused) {
            return new HashMap();
        }
    }
}
