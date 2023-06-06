package com.sankuai.waimai.router.service;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    public static final b b = new b();

    @Override // com.sankuai.waimai.router.service.c
    @NonNull
    public final <T> T a(@NonNull Class<T> cls) throws Exception {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984ab622bb577abf7a03e30fabf339f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984ab622bb577abf7a03e30fabf339f0");
        }
        T t = (T) com.sankuai.waimai.router.utils.e.a(cls);
        return t != null ? t : cls.newInstance();
    }
}
