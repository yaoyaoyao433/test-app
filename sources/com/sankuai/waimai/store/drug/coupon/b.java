package com.sankuai.waimai.store.drug.coupon;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect a;
    private final MemberCouponEntry b;

    private b(MemberCouponEntry memberCouponEntry) {
        this.b = memberCouponEntry;
    }

    public static DialogInterface.OnDismissListener a(MemberCouponEntry memberCouponEntry) {
        Object[] objArr = {memberCouponEntry};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e396251ceac09e34e5990ae2bb435d2e", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnDismissListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e396251ceac09e34e5990ae2bb435d2e") : new b(memberCouponEntry);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8a1c3f21475a25dc0bccd270c66808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8a1c3f21475a25dc0bccd270c66808");
        } else {
            MemberCouponEntry.b(this.b, dialogInterface);
        }
    }
}
