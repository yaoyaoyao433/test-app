package com.sankuai.waimai.guidepop.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static WeakReference<Gson> b;

    private static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77e6de15f31b0df9bfa04dbc6965b825", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77e6de15f31b0df9bfa04dbc6965b825");
        }
        if (b == null || b.get() == null) {
            b = new WeakReference<>(new Gson());
        }
        return b.get();
    }

    public static <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb4b37b10e5a5d1d29fac86f6c8b759b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb4b37b10e5a5d1d29fac86f6c8b759b");
        }
        if (str == null || type == null) {
            return null;
        }
        try {
            return (T) a().fromJson(str, type);
        } catch (Throwable th) {
            b.a("JsonUtil-->fromJsonString exception:" + th.getMessage());
            th.printStackTrace();
            return null;
        }
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b68f5fa18bd4781394cdda766df492d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b68f5fa18bd4781394cdda766df492d");
        }
        if (obj == null) {
            return null;
        }
        try {
            return a().toJson(obj);
        } catch (Throwable th) {
            b.a("JsonUtil-->fromJsonString exception:" + th.getMessage());
            th.printStackTrace();
            return null;
        }
    }
}
