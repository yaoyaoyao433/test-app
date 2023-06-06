package com.meituan.android.legwork.common.util;

import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements HornCallback {
    public static ChangeQuickRedirect a;
    private final c b;

    private d(c cVar) {
        this.b = cVar;
    }

    public static HornCallback a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f61fff287ee89d128e8a0616d3f54873", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f61fff287ee89d128e8a0616d3f54873") : new d(cVar);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c9130cb2af2d858afc7071201a6bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c9130cb2af2d858afc7071201a6bd2");
        } else {
            c.a(this.b, z, str);
        }
    }
}
