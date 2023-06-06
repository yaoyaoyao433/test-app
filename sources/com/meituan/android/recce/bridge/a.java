package com.meituan.android.recce.bridge;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ConcurrentHashMap<String, Class<? extends RecceCustomApi>> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, RecceCustomApi> c;
    private final com.meituan.android.recce.b d;

    public a(com.meituan.android.recce.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1835ecd5880a70ad33c3c4197e2e37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1835ecd5880a70ad33c3c4197e2e37");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.d = bVar;
    }

    public final void a(String str, RecceCustomApi recceCustomApi) {
        Object[] objArr = {str, recceCustomApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563dc02e87eed26cdf57d7c210a8de39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563dc02e87eed26cdf57d7c210a8de39");
        } else if (this.c.containsKey(str)) {
            throw new RuntimeException("Interface " + str + " has already been registered, please don't override it or change an interface name");
        } else {
            recceCustomApi.a(this.d.b());
            this.c.put(str, recceCustomApi);
        }
    }

    public final Object a(String str) {
        Class<? extends RecceCustomApi> cls;
        ReflectiveOperationException e;
        RecceCustomApi recceCustomApi;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06b6a15f8e75dbb4924576113443b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06b6a15f8e75dbb4924576113443b6a");
        }
        RecceCustomApi recceCustomApi2 = this.c.get(str);
        if (recceCustomApi2 != null || (cls = b.get(str)) == null) {
            return recceCustomApi2;
        }
        try {
            recceCustomApi = cls.newInstance();
            try {
                recceCustomApi.a(this.d.b());
                return recceCustomApi;
            } catch (IllegalAccessException | InstantiationException e2) {
                e = e2;
                e.printStackTrace();
                return recceCustomApi;
            }
        } catch (IllegalAccessException | InstantiationException e3) {
            e = e3;
            recceCustomApi = recceCustomApi2;
        }
    }

    public static void a(b bVar) {
        Map<String, Class<? extends RecceCustomApi>> a2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "181dd7c4bc1c80ef2771891d31c9dfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "181dd7c4bc1c80ef2771891d31c9dfe4");
        } else if (bVar != null && (a2 = bVar.a()) != null) {
            for (Map.Entry<String, Class<? extends RecceCustomApi>> entry : a2.entrySet()) {
                Class<? extends RecceCustomApi> cls = b.get(entry.getKey());
                if (cls != null && cls != entry.getValue()) {
                    Log.e("", "Lazy Interface [" + entry.getKey() + ": " + entry.getValue() + "] has been replaced by [" + entry.getKey() + ": " + cls + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    throw new RuntimeException("Interface " + entry.getKey() + " has already been registered, please don't override it or change an interface name");
                }
                b.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
