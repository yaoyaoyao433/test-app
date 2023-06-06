package com.meituan.android.paycommon.lib.settings;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PaySettingActivity b;

    private a(PaySettingActivity paySettingActivity) {
        this.b = paySettingActivity;
    }

    public static View.OnClickListener a(PaySettingActivity paySettingActivity) {
        Object[] objArr = {paySettingActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e7b1407374156bf381dbd73e916670a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e7b1407374156bf381dbd73e916670a") : new a(paySettingActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e41bf9784ba70f093a4ff0198802a40", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e41bf9784ba70f093a4ff0198802a40");
        } else {
            PaySettingActivity.a(this.b, view);
        }
    }
}
