package com.meituan.android.pay.fragment;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    private t(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    public static View.OnTouchListener a(VerifyBankInfoFragment verifyBankInfoFragment) {
        Object[] objArr = {verifyBankInfoFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b41eed26b9c0622bbacad50250a007d8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnTouchListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b41eed26b9c0622bbacad50250a007d8") : new t(verifyBankInfoFragment);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84945ae6b94cf7e68390c0a419946af4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84945ae6b94cf7e68390c0a419946af4")).booleanValue() : VerifyBankInfoFragment.a(this.b, view, motionEvent);
    }
}
