package com.meituan.android.pay.desk.payment.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final String c;

    private f(e eVar, String str) {
        this.b = eVar;
        this.c = str;
    }

    public static View.OnClickListener a(e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c113a288652e4c7f0b2e30a6276dbba", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c113a288652e4c7f0b2e30a6276dbba") : new f(eVar, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c696e35cbf026e4723d333457be2810", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c696e35cbf026e4723d333457be2810");
        } else {
            e.a(this.b, this.c, view);
        }
    }
}
