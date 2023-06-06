package com.meituan.android.cashier.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;
    private final HashMap c;
    private final String d;

    private b(MTCashierRevisionFragment mTCashierRevisionFragment, HashMap hashMap, String str) {
        this.b = mTCashierRevisionFragment;
        this.c = hashMap;
        this.d = str;
    }

    public static View.OnClickListener a(MTCashierRevisionFragment mTCashierRevisionFragment, HashMap hashMap, String str) {
        Object[] objArr = {mTCashierRevisionFragment, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24519da034262551faa9a04a1f081350", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24519da034262551faa9a04a1f081350") : new b(mTCashierRevisionFragment, hashMap, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc46ba171159f8accd46584e7847ce1e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc46ba171159f8accd46584e7847ce1e");
        } else {
            MTCashierRevisionFragment.a(this.b, this.c, this.d, view);
        }
    }
}
