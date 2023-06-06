package com.meituan.android.paybase.downgrading;

import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements HornCallback {
    public static ChangeQuickRedirect a;
    private final d b;

    private e(d dVar) {
        this.b = dVar;
    }

    public static HornCallback a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b6d7f2b95f7107b107c45231299b7ca", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b6d7f2b95f7107b107c45231299b7ca") : new e(dVar);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3368d2b001bdd0e7cb8281dc9628f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3368d2b001bdd0e7cb8281dc9628f22");
        } else {
            d.a(this.b, z, str);
        }
    }
}
