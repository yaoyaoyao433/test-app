package com.meituan.android.cashier.common;

import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements HornCallback {
    public static ChangeQuickRedirect a;
    private final b b;

    private c(b bVar) {
        this.b = bVar;
    }

    public static HornCallback a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65febd4e9e68d9810b6a74073dfd74cc", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65febd4e9e68d9810b6a74073dfd74cc") : new c(bVar);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec14a00c02375f686645097b6a6bfc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec14a00c02375f686645097b6a6bfc3");
        } else {
            b.a(this.b, z, str);
        }
    }
}
