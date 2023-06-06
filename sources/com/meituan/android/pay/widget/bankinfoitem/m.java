package com.meituan.android.pay.widget.bankinfoitem;

import android.view.View;
import com.meituan.android.pay.model.bean.FactorValueSug;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;
    private final String c;
    private final FactorValueSug d;

    private m(j jVar, String str, FactorValueSug factorValueSug) {
        this.b = jVar;
        this.c = str;
        this.d = factorValueSug;
    }

    public static View.OnClickListener a(j jVar, String str, FactorValueSug factorValueSug) {
        Object[] objArr = {jVar, str, factorValueSug};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6e4b1865e8bff3c55accf0a985ebb7b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6e4b1865e8bff3c55accf0a985ebb7b") : new m(jVar, str, factorValueSug);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aeaaf3e1b164c215a85ed9253fb8af", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aeaaf3e1b164c215a85ed9253fb8af");
        } else {
            j.a(this.b, this.c, this.d, view);
        }
    }
}
