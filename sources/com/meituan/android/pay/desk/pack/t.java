package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.desk.payment.view.InstallmentRateDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final Fragment c;
    private final MTPayment d;

    private t(e eVar, Fragment fragment, MTPayment mTPayment) {
        this.b = eVar;
        this.c = fragment;
        this.d = mTPayment;
    }

    public static View.OnClickListener a(e eVar, Fragment fragment, MTPayment mTPayment) {
        Object[] objArr = {eVar, fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faa9f0897cfe78b31e4886e497f98c92", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faa9f0897cfe78b31e4886e497f98c92") : new t(eVar, fragment, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InstallmentRateDialogFragment a2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0164f48a72609589bfa2694dda72fe", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0164f48a72609589bfa2694dda72fe");
            return;
        }
        e eVar = this.b;
        Fragment fragment = this.c;
        MTPayment mTPayment = this.d;
        Object[] objArr2 = {eVar, fragment, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ffccaa48fe8d763766f0f930da73d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ffccaa48fe8d763766f0f930da73d09");
            return;
        }
        Object[] objArr3 = {fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "a2ec7a5151d31761279716eb79611a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "a2ec7a5151d31761279716eb79611a47");
        } else if (mTPayment == null || mTPayment.getInstallmentRateDescBean() == null || fragment == null || (a2 = InstallmentRateDialogFragment.a(mTPayment)) == null) {
        } else {
            a2.a(fragment.getChildFragmentManager());
        }
    }
}
