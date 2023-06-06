package com.sankuai.waimai.router.service;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private final Context b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ccab50547d1475576446ab3467112a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ccab50547d1475576446ab3467112a0");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.router.service.c
    @NonNull
    public final <T> T a(@NonNull Class<T> cls) throws Exception {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb17db67f4a24374184af0f2411d3865", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb17db67f4a24374184af0f2411d3865") : cls.getConstructor(Context.class).newInstance(this.b);
    }
}
