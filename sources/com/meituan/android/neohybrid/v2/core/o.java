package com.meituan.android.neohybrid.v2.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements OnWebViewInitFailedListener {
    public static ChangeQuickRedirect a;
    private final n b;

    private o(n nVar) {
        this.b = nVar;
    }

    public static OnWebViewInitFailedListener a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f00f4a4529cb755865f31d35ed943f5a", RobustBitConfig.DEFAULT_VALUE) ? (OnWebViewInitFailedListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f00f4a4529cb755865f31d35ed943f5a") : new o(nVar);
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener
    public final void onFailed(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc715e7dc97f71946a5544f06ea144a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc715e7dc97f71946a5544f06ea144a2");
        } else {
            n.a(this.b, th);
        }
    }
}
