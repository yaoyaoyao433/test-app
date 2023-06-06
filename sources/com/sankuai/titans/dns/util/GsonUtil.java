package com.sankuai.titans.dns.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GsonUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile Gson sExcludeGson;

    public static Gson getExcludeGson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "174cfde1a40c081a1ddc6d2d9f5f0b94", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "174cfde1a40c081a1ddc6d2d9f5f0b94");
        }
        if (sExcludeGson == null) {
            synchronized (GsonUtil.class) {
                if (sExcludeGson == null) {
                    sExcludeGson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                }
            }
        }
        return sExcludeGson;
    }
}
