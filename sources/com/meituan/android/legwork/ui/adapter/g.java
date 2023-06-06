package com.meituan.android.legwork.ui.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final IMLocationMsgAdapter b;
    private final String c;

    private g(IMLocationMsgAdapter iMLocationMsgAdapter, String str) {
        this.b = iMLocationMsgAdapter;
        this.c = str;
    }

    public static View.OnClickListener a(IMLocationMsgAdapter iMLocationMsgAdapter, String str) {
        Object[] objArr = {iMLocationMsgAdapter, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c31c029ac3f2cbfb5042dab7fdd188da", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c31c029ac3f2cbfb5042dab7fdd188da") : new g(iMLocationMsgAdapter, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cb670f6ee14c25aa47b58380577088", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cb670f6ee14c25aa47b58380577088");
        } else {
            IMLocationMsgAdapter.a(this.b, this.c, view);
        }
    }
}
