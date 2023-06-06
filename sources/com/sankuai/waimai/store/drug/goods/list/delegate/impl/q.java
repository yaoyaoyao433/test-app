package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;
    private final Intent c;

    private q(m mVar, Intent intent) {
        this.b = mVar;
        this.c = intent;
    }

    public static Runnable a(m mVar, Intent intent) {
        Object[] objArr = {mVar, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "061186e8dc123839db430987ea363ebc", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "061186e8dc123839db430987ea363ebc") : new q(mVar, intent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933df8a7574e08ba88ee9725233c0bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933df8a7574e08ba88ee9725233c0bce");
        } else {
            m.a(this.b, this.c);
        }
    }
}
