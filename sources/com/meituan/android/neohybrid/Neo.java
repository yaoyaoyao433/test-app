package com.meituan.android.neohybrid;

import android.support.annotation.Keep;
import com.meituan.android.neohybrid.debug.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public final class Neo {
    public static final String DISABLE_ENCRYPT = "neo_encrypt_disabled";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static com.meituan.android.neohybrid.debug.a debugger() {
        d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e23579c8b6b2183f14d7e905cf8aea1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.debug.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e23579c8b6b2183f14d7e905cf8aea1");
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            return com.meituan.android.neohybrid.debug.b.a();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "db3b319393d170aea2319efcd3e1ae94", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "db3b319393d170aea2319efcd3e1ae94");
        }
        dVar = d.a.a;
        return dVar;
    }
}
