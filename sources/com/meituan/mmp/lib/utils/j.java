package com.meituan.mmp.lib.utils;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public static final Gson b = new GsonBuilder().setLenient().create();

    @NonNull
    public static <T> T a(String str, Class<T> cls) throws JsonSyntaxException {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1055ead0d952bae4e228d402ea8346e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1055ead0d952bae4e228d402ea8346e");
        }
        T t = (T) b.fromJson(str, (Class<Object>) cls);
        if (t != null) {
            return t;
        }
        throw new JsonSyntaxException("result should not be null");
    }

    @NonNull
    public static <T> T a(String str, Type type) throws JsonSyntaxException {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af33fa7b03f6922414fb80e05f8b2145", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af33fa7b03f6922414fb80e05f8b2145");
        }
        T t = (T) b.fromJson(str, type);
        if (t != null) {
            return t;
        }
        throw new JsonSyntaxException("result should not be null");
    }
}
