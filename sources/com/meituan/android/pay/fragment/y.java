package com.meituan.android.pay.fragment;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class y implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    public y(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c3b4a5f1c46a5c3a41251971138a892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c3b4a5f1c46a5c3a41251971138a892");
        } else {
            VerifyBankInfoFragment.a(this.b, compoundButton, z);
        }
    }
}
