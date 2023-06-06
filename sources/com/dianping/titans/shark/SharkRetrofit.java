package com.dianping.titans.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.converter.gson.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class SharkRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SharkRetrofit instance;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f23retrofit;

    public SharkRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4903e7bbfa13d6cafb3aa89cad3fe8d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4903e7bbfa13d6cafb3aa89cad3fe8d9");
        } else {
            this.f23retrofit = new ar.a().a("http://meituan.com").a(SharkManager.getSharkModule().getRawCallFactory()).a(a.a()).a();
        }
    }

    public static SharkRetrofit getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43a84b7834c9f694b56f442820d7ec55", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharkRetrofit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43a84b7834c9f694b56f442820d7ec55");
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
        return this.f23retrofit;
    }
}
