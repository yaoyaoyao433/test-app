package com.meituan.android.customerservice.channel.voip.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoadingDialog extends Dialog {
    public static ChangeQuickRedirect a;

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public LoadingDialog(@NonNull Context context) {
        super(context, R.style.cs_dialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108f567543e6d5ab010b07cca933773a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108f567543e6d5ab010b07cca933773a");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42160d31b7040833db96b4943ad78465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42160d31b7040833db96b4943ad78465");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_dialog_loading);
    }
}
