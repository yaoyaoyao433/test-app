package com.meituan.passport.outer;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    private e(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    public static CompoundButton.OnCheckedChangeListener a(OuterMobileIndexFragment outerMobileIndexFragment) {
        Object[] objArr = {outerMobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e64d7aec430d2a3abe8bc61bdc920ec", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e64d7aec430d2a3abe8bc61bdc920ec") : new e(outerMobileIndexFragment);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1135382eba7e1a38b1cc6f944afca090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1135382eba7e1a38b1cc6f944afca090");
        } else {
            OuterMobileIndexFragment.a(this.b, compoundButton, z);
        }
    }
}
