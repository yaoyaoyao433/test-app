package com.meituan.android.paypassport;

import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.paybase.login.b b;

    public b(com.meituan.android.paybase.login.b bVar) {
        this.b = bVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c76b6bcc45087a444f1d7042ac2fa68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c76b6bcc45087a444f1d7042ac2fa68");
            return;
        }
        com.meituan.android.paybase.login.b bVar = this.b;
        UserCenter.c cVar = (UserCenter.c) obj;
        Object[] objArr2 = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c977209e69d29028a3c455e569c56779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c977209e69d29028a3c455e569c56779");
        } else if (cVar == null || bVar == null) {
        } else {
            if (cVar.b == UserCenter.d.login) {
                bVar.a(true);
            } else if (cVar.b == UserCenter.d.logout) {
                bVar.a(false);
            }
        }
    }
}
