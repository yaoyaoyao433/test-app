package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.common.promotion.bean.LabelIcon;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a b;
    private final LabelIcon c;

    private c(a aVar, LabelIcon labelIcon) {
        this.b = aVar;
        this.c = labelIcon;
    }

    public static View.OnClickListener a(a aVar, LabelIcon labelIcon) {
        Object[] objArr = {aVar, labelIcon};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4418444b518bd2667dd9e6b645ff2057", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4418444b518bd2667dd9e6b645ff2057") : new c(aVar, labelIcon);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9308d4d94a6833a497f7ed2ad681b983", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9308d4d94a6833a497f7ed2ad681b983");
        } else {
            a.a(this.b, this.c, view);
        }
    }
}
