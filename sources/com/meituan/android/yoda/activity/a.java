package com.meituan.android.yoda.activity;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final YodaConfirmActivity b;

    private a(YodaConfirmActivity yodaConfirmActivity) {
        this.b = yodaConfirmActivity;
    }

    public static View.OnClickListener a(YodaConfirmActivity yodaConfirmActivity) {
        Object[] objArr = {yodaConfirmActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f27e5677d87c3329d24f5094669f0f1f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f27e5677d87c3329d24f5094669f0f1f") : new a(yodaConfirmActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e432b6f09a48dc43a1c3ed308d7323bb", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e432b6f09a48dc43a1c3ed308d7323bb");
        } else {
            YodaConfirmActivity.a(this.b, view);
        }
    }
}
