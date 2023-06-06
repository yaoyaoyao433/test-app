package com.meituan.android.legwork.mvp.presenter;

import com.meituan.android.legwork.common.jarvis.JarvisConfigChangeReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements JarvisConfigChangeReceiver.a {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.legwork.common.jarvis.JarvisConfigChangeReceiver.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931957da9fe7387a3d0a32eda0d3859d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931957da9fe7387a3d0a32eda0d3859d");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6bbfe5f943864152b375b65f4b8f1861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6bbfe5f943864152b375b65f4b8f1861");
        } else {
            aVar.d();
        }
    }
}
