package com.meituan.android.yoda.network.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c d;
    Gson b;
    final GsonBuilder c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab6887a874035430ef9de21339d5099", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab6887a874035430ef9de21339d5099");
        } else {
            this.c = new GsonBuilder();
        }
    }

    public static synchronized c a() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "379879b8d280ce00b21f522dc6afdec4", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "379879b8d280ce00b21f522dc6afdec4");
            }
            if (d == null) {
                d = new c();
            }
            return d;
        }
    }
}
