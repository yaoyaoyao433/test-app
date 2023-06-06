package com.meituan.android.pay.desk.payment.view;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final BaseDeductSwitchView b;
    private final CompoundButton.OnCheckedChangeListener c;

    private c(BaseDeductSwitchView baseDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.b = baseDeductSwitchView;
        this.c = onCheckedChangeListener;
    }

    public static CompoundButton.OnCheckedChangeListener a(BaseDeductSwitchView baseDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {baseDeductSwitchView, onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202d01bd6abec780271c6aeb23a17c0c", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202d01bd6abec780271c6aeb23a17c0c") : new c(baseDeductSwitchView, onCheckedChangeListener);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835a388d7d729433625de09eeb64653f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835a388d7d729433625de09eeb64653f");
        } else {
            BaseDeductSwitchView.a(this.b, this.c, compoundButton, z);
        }
    }
}
