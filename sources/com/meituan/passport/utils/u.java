package com.meituan.passport.utils;

import android.view.View;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final t b;
    private final OAuthItem c;

    private u(t tVar, OAuthItem oAuthItem) {
        this.b = tVar;
        this.c = oAuthItem;
    }

    public static View.OnClickListener a(t tVar, OAuthItem oAuthItem) {
        Object[] objArr = {tVar, oAuthItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9f38b06d9fdef69b8e73f35999c6433", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9f38b06d9fdef69b8e73f35999c6433") : new u(tVar, oAuthItem);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f66ce3a892c5414e08765886b6c8f3e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f66ce3a892c5414e08765886b6c8f3e");
            return;
        }
        t tVar = this.b;
        OAuthItem oAuthItem = this.c;
        Object[] objArr2 = {tVar, oAuthItem, view};
        ChangeQuickRedirect changeQuickRedirect2 = t.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ed3f8f6e1f5e9e96097b41de26e98593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ed3f8f6e1f5e9e96097b41de26e98593");
        } else if (tVar.e != null) {
            tVar.e.a(oAuthItem);
        }
    }
}
