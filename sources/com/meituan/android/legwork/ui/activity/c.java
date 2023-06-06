package com.meituan.android.legwork.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ToSendOneMoreActivity b;
    private final Bundle c;

    private c(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle) {
        this.b = toSendOneMoreActivity;
        this.c = bundle;
    }

    public static View.OnClickListener a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle) {
        Object[] objArr = {toSendOneMoreActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e59b849211586bcc0587c2fb7cd9b7e3", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e59b849211586bcc0587c2fb7cd9b7e3") : new c(toSendOneMoreActivity, bundle);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a7fc3f68c63f75cc0ed991d0d4479d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a7fc3f68c63f75cc0ed991d0d4479d");
        } else {
            ToSendOneMoreActivity.a(this.b, this.c, view);
        }
    }
}
