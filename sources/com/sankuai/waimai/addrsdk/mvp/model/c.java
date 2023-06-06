package com.sankuai.waimai.addrsdk.mvp.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c b = new c();

    public static c a() {
        return b;
    }

    public final b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b337c24999583587083eeb58debb51b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b337c24999583587083eeb58debb51b") : new com.sankuai.waimai.addrsdk.mvp.model.impl.b();
    }
}
