package com.sankuai.waimai.rocks.view.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends e {
    public static ChangeQuickRedirect p;
    public com.meituan.android.cube.pga.viewmodel.a q;

    @Override // com.sankuai.waimai.rocks.view.viewmodel.e
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808659c97ff88192b6c1b9a2c5e894e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808659c97ff88192b6c1b9a2c5e894e1");
        } else if (this.q != null) {
            this.q.b_(this.w);
        }
    }
}
