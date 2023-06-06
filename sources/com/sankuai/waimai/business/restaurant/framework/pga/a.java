package com.sankuai.waimai.business.restaurant.framework.pga;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.cube.pga.common.j;
import com.meituan.android.cube.pga.core.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect g;

    @Override // com.meituan.android.cube.pga.core.b, com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a(@NonNull FragmentActivity fragmentActivity, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfb9f6f2314a51dab7123ec83c33890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfb9f6f2314a51dab7123ec83c33890");
            return;
        }
        this.f = (com.meituan.android.cube.pga.core.a) b(fragmentActivity, bundle);
        this.c = g();
        if ((this.c instanceof com.meituan.android.cube.pga.block.a) && (this.f instanceof com.meituan.android.cube.pga.core.a)) {
            this.f.g = (com.meituan.android.cube.pga.block.a) this.c;
        }
        if (this.c != null) {
            this.c.a(this.f, 2);
        }
        this.f.h.a((j<Bundle>) bundle);
    }
}
