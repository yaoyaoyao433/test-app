package com.sankuai.titans.protocol.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsonUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile Gson sExcludeGson;

    public static Gson getExcludeGson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "333f6b88913ea6dac79a7f8871a06d0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "333f6b88913ea6dac79a7f8871a06d0b");
        }
        if (sExcludeGson == null) {
            synchronized (JsonUtils.class) {
                if (sExcludeGson == null) {
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.excludeFieldsWithoutExposeAnnotation();
                    sExcludeGson = gsonBuilder.create();
                }
            }
        }
        return sExcludeGson;
    }
}
