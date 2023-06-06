package com.meituan.passport.dialogs;

import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements t.a {
    public static ChangeQuickRedirect a;
    private final OtherLoginDialogFragment b;

    public j(OtherLoginDialogFragment otherLoginDialogFragment) {
        this.b = otherLoginDialogFragment;
    }

    @Override // com.meituan.passport.utils.t.a
    public final void a(OAuthItem oAuthItem) {
        Object[] objArr = {oAuthItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d4dc223a015ba91ed4049109974d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d4dc223a015ba91ed4049109974d10");
        } else {
            OtherLoginDialogFragment.a(this.b, oAuthItem);
        }
    }
}
