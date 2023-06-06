package com.meituan.android.neohybrid.neo;

import android.os.Bundle;
import com.meituan.android.neohybrid.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements b.a {
    public static ChangeQuickRedirect a;
    private final Bundle b;

    public c(Bundle bundle) {
        this.b = bundle;
    }

    @Override // com.meituan.android.neohybrid.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea269abf72ba7d5a43deea7f9af8106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea269abf72ba7d5a43deea7f9af8106");
            return;
        }
        Object[] objArr2 = {this.b, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e3e4b3a577cd6bc2826f82838fd5f2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e3e4b3a577cd6bc2826f82838fd5f2c3");
        }
    }
}
