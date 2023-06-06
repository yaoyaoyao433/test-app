package com.meituan.android.neohybrid.v2.neo;

import android.os.Bundle;
import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements b.a {
    public static ChangeQuickRedirect a;
    private final Bundle b;

    public i(Bundle bundle) {
        this.b = bundle;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf908d555b765bd2d8b362bd47ff880a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf908d555b765bd2d8b362bd47ff880a");
            return;
        }
        Bundle bundle = this.b;
        Object[] objArr2 = {bundle, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f9ac9fa80278f9bda26084bc81eea313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f9ac9fa80278f9bda26084bc81eea313");
        } else {
            aVar.a(bundle);
        }
    }
}
