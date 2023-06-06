package com.meituan.android.yoda.fragment;

import com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ThirdPartyVerifyFragment.b {
    public static ChangeQuickRedirect a;
    private final ThirdPartyVerifyFragment b;

    public g(ThirdPartyVerifyFragment thirdPartyVerifyFragment) {
        this.b = thirdPartyVerifyFragment;
    }

    @Override // com.meituan.android.yoda.fragment.ThirdPartyVerifyFragment.b
    public final void a(ThirdPartyVerifyFragment.ThirdPartyBean thirdPartyBean) {
        Object[] objArr = {thirdPartyBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51945b3f98779ca74f9b4e5dc4f2d4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51945b3f98779ca74f9b4e5dc4f2d4c9");
        } else {
            ThirdPartyVerifyFragment.a(this.b, thirdPartyBean);
        }
    }
}
