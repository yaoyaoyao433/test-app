package com.meituan.android.neohybrid.v2.neo;

import android.os.Bundle;
import com.meituan.android.neohybrid.v2.neo.b;
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

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30de65c183b324307e23da30f32999cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30de65c183b324307e23da30f32999cf");
            return;
        }
        Object[] objArr2 = {this.b, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2d5f863fa5ef702365bf7b8193714c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2d5f863fa5ef702365bf7b8193714c48");
        }
    }
}
