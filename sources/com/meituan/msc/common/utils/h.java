package com.meituan.msc.common.utils;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static final Gson b = new GsonBuilder().setLenient().create();

    @NonNull
    public static <T> T a(String str, Class<T> cls) throws JsonSyntaxException {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5f1eead9ba94449a2230e985f82e8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5f1eead9ba94449a2230e985f82e8b8");
        }
        T t = (T) b.fromJson(str, (Class<Object>) cls);
        if (t != null) {
            return t;
        }
        throw new JsonSyntaxException("result should not be null");
    }
}
