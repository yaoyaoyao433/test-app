package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.passport.login.fragment.DynamicAccountLoginFragment;
import com.meituan.passport.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment.AnonymousClass4 b;

    private j(DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4) {
        this.b = anonymousClass4;
    }

    public static View.OnClickListener a(DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4) {
        Object[] objArr = {anonymousClass4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f45681f6ef906dde9cd29e8b0f3507bd", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f45681f6ef906dde9cd29e8b0f3507bd") : new j(anonymousClass4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43c7ca9048182e50d2f42db060c7007", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43c7ca9048182e50d2f42db060c7007");
            return;
        }
        DynamicAccountLoginFragment.AnonymousClass4 anonymousClass4 = this.b;
        Object[] objArr2 = {anonymousClass4, view};
        ChangeQuickRedirect changeQuickRedirect2 = DynamicAccountLoginFragment.AnonymousClass4.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b53cef7dd46b46f37387eaea14a937c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b53cef7dd46b46f37387eaea14a937c");
            return;
        }
        DynamicAccountLoginFragment.this.t.b();
        aj.a(DynamicAccountLoginFragment.this, "b_uwle8hr3", "c_ph4yzc83");
    }
}
