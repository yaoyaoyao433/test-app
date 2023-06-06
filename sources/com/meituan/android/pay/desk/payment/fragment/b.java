package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a b;
    private final Agreement c;

    private b(a aVar, Agreement agreement) {
        this.b = aVar;
        this.c = agreement;
    }

    public static View.OnClickListener a(a aVar, Agreement agreement) {
        Object[] objArr = {aVar, agreement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c66017e0391793b786b5447ce7c2b2fb", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c66017e0391793b786b5447ce7c2b2fb") : new b(aVar, agreement);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b3f391486c7c975e9a82f7fc2855d3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b3f391486c7c975e9a82f7fc2855d3");
        } else {
            a.a(this.b, this.c, view);
        }
    }
}
