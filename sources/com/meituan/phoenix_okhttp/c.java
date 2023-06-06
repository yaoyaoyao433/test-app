package com.meituan.phoenix_okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.v;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements com.meituan.phoenix.base_interface.c {
    public static ChangeQuickRedirect a;
    private v b;

    public c(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc98a2c2481f23b097c78ddea891ebce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc98a2c2481f23b097c78ddea891ebce");
        } else {
            this.b = vVar;
        }
    }

    @Override // com.meituan.phoenix.base_interface.c
    public final boolean a(com.meituan.phoenix.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dca6f40241bc0f787447148d4a2b8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dca6f40241bc0f787447148d4a2b8d")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        this.b.g.add(new e(com.meituan.phoenix.b.c, aVar));
        return true;
    }
}
