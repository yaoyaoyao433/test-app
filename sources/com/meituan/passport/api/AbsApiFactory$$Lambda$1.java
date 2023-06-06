package com.meituan.passport.api;

import com.meituan.passport.converter.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class AbsApiFactory$$Lambda$1 implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AbsApiFactory$$Lambda$1 instance = new AbsApiFactory$$Lambda$1();

    @Override // com.meituan.passport.converter.a
    public final Throwable handleError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c4a55dd411da29444098afb5515c81e", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c4a55dd411da29444098afb5515c81e") : AbsApiFactory.lambda$errorHandler$9(th);
    }
}
