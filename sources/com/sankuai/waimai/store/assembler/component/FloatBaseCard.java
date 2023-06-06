package com.sankuai.waimai.store.assembler.component;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class FloatBaseCard extends BaseCard {
    public static ChangeQuickRedirect h;

    public void a(boolean z) {
    }

    public FloatBaseCard(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8b0047378d51e7d01cc1d0528d379f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8b0047378d51e7d01cc1d0528d379f");
        }
    }
}
