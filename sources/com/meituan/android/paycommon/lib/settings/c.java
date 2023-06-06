package com.meituan.android.paycommon.lib.settings;

import android.content.DialogInterface;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PaySettingActivity b;
    private final EditText c;

    private c(PaySettingActivity paySettingActivity, EditText editText) {
        this.b = paySettingActivity;
        this.c = editText;
    }

    public static DialogInterface.OnClickListener a(PaySettingActivity paySettingActivity, EditText editText) {
        Object[] objArr = {paySettingActivity, editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5ee9ac08d4753e880fbcc3aebc54a07", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5ee9ac08d4753e880fbcc3aebc54a07") : new c(paySettingActivity, editText);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfbbf91c803544beaf1d22554c4e34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfbbf91c803544beaf1d22554c4e34b");
        } else {
            PaySettingActivity.a(this.b, this.c, dialogInterface, i);
        }
    }
}
