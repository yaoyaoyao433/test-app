package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.passport.login.fragment.DynamicAccountLoginFragment;
import com.meituan.passport.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment.AnonymousClass4 b;

    private k(DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4) {
        this.b = anonymousClass4;
    }

    public static View.OnClickListener a(DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4) {
        Object[] objArr = {anonymousClass4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36373ae1446a5088444d41d6c1fe8518", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36373ae1446a5088444d41d6c1fe8518") : new k(anonymousClass4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab9ddbf1e92334958ca5092fd64cd0f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab9ddbf1e92334958ca5092fd64cd0f");
            return;
        }
        DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4 = this.b;
        Object[] objArr2 = {anonymousClass4, view};
        ChangeQuickRedirect changeQuickRedirect2 = DynamicAccountLoginFragment.AnonymousClass4.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aa2dd84f50445e6816d0a31ef7460847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aa2dd84f50445e6816d0a31ef7460847");
            return;
        }
        DynamicAccountLoginFragment.this.n.a();
        aj.a(DynamicAccountLoginFragment.this, "b_b3t1tsbz", "c_ph4yzc83");
    }
}
