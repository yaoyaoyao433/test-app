package com.dianping.sdk.pike.agg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends com.dianping.sdk.pike.message.d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befc2d412edd4894da872d219b6b2776", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befc2d412edd4894da872d219b6b2776") : this.g;
    }
}
