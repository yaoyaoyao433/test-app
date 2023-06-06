package com.meituan.android.paycommon.lib.widgets;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final CheckView b;

    private a(CheckView checkView) {
        this.b = checkView;
    }

    public static CompoundButton.OnCheckedChangeListener a(CheckView checkView) {
        Object[] objArr = {checkView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44089ef13cf9a74b508705251cd521b7", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44089ef13cf9a74b508705251cd521b7") : new a(checkView);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34519eee56f3fb9d2ee531a8f0e324f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34519eee56f3fb9d2ee531a8f0e324f2");
        } else {
            CheckView.a(this.b, compoundButton, z);
        }
    }
}
