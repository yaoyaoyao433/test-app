package com.sankuai.waimai.store.drug.coupon;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements DialogInterface.OnShowListener {
    public static ChangeQuickRedirect a;
    private final MemberCouponEntry b;

    private c(MemberCouponEntry memberCouponEntry) {
        this.b = memberCouponEntry;
    }

    public static DialogInterface.OnShowListener a(MemberCouponEntry memberCouponEntry) {
        Object[] objArr = {memberCouponEntry};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdfabf803340c7d17af55aa1f285c2ba", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnShowListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdfabf803340c7d17af55aa1f285c2ba") : new c(memberCouponEntry);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a1ebd69a1422193e1a6947ec24cfc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a1ebd69a1422193e1a6947ec24cfc9");
        } else {
            MemberCouponEntry.a(this.b, dialogInterface);
        }
    }
}
