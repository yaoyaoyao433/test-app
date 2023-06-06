package com.meituan.android.pay.desk.payment.view;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final BalanceCombineDeductSwitchView b;
    private final CompoundButton.OnCheckedChangeListener c;

    private a(BalanceCombineDeductSwitchView balanceCombineDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.b = balanceCombineDeductSwitchView;
        this.c = onCheckedChangeListener;
    }

    public static CompoundButton.OnCheckedChangeListener a(BalanceCombineDeductSwitchView balanceCombineDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {balanceCombineDeductSwitchView, onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6aa3c3a6b3dddaf1ce8140af24e5bdb0", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6aa3c3a6b3dddaf1ce8140af24e5bdb0") : new a(balanceCombineDeductSwitchView, onCheckedChangeListener);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ea38526629a3e13c0678ee32926d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ea38526629a3e13c0678ee32926d2c");
        } else {
            BalanceCombineDeductSwitchView.a(this.b, this.c, compoundButton, z);
        }
    }
}
