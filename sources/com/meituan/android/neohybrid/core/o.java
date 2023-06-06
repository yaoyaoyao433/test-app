package com.meituan.android.neohybrid.core;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f5d59cda151ee548e0c6c0522553b60", RobustBitConfig.DEFAULT_VALUE) ? (OnWebViewInitFailedListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f5d59cda151ee548e0c6c0522553b60") : new o(nVar);
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener
    public final void onFailed(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2815c361cdecfdf0208743a1efbdbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2815c361cdecfdf0208743a1efbdbc");
        } else {
            n.a(this.b, th);
        }
    }
}
