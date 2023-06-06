package com.sankuai.titans.proxy.shark.net;

import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.converter.gson.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class SharkRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SharkRetrofit instance;

    /* renamed from: retrofit  reason: collision with root package name */
    private final ar f31retrofit;

    public SharkRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce952810c9180e118b77bf4e243c7558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce952810c9180e118b77bf4e243c7558");
        } else {
            this.f31retrofit = new ar.a().a("http://meituan.com").a(i.a("defaultnvnetwork")).a(a.a()).a();
        }
    }

    public static SharkRetrofit getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff3a393771db0dd1bfc9bd38c9b6b19c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharkRetrofit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff3a393771db0dd1bfc9bd38c9b6b19c");
        }
        if (instance == null) {
            synchronized (SharkRetrofit.class) {
                if (instance == null) {
                    instance = new SharkRetrofit();
                }
            }
        }
        return instance;
    }

    public final ar getRetrofit() {
        return this.f31retrofit;
    }
}
