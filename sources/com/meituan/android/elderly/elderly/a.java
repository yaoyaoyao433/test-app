package com.meituan.android.elderly.elderly;

import com.meituan.android.elderly.bean.OverLoadInfo;
import com.meituan.android.elderly.payresult.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements a.InterfaceC0257a {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;

    public a(ElderlyCashier elderlyCashier) {
        this.b = elderlyCashier;
    }

    @Override // com.meituan.android.elderly.payresult.a.InterfaceC0257a
    public final void a(OverLoadInfo overLoadInfo) {
        Object[] objArr = {overLoadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9a631b5e8590c19ca6b88fecbda153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9a631b5e8590c19ca6b88fecbda153");
        } else {
            ElderlyCashier.a(this.b, overLoadInfo);
        }
    }
}
