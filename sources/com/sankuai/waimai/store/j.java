package com.sankuai.waimai.store;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class j extends com.meituan.android.cube.core.f {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.android.cube.core.f
    /* renamed from: q */
    public final SCBaseActivity l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4714509e068b2255b501575a88d46b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4714509e068b2255b501575a88d46b2");
        }
        FragmentActivity l = super.l();
        if (l instanceof SCBaseActivity) {
            return (SCBaseActivity) l;
        }
        throw new RuntimeException("Activity of cube block must be SCBaseActivity!");
    }
}
