package com.meituan.mmp.lib.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoadingDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public TextView b;

    public LoadingDialog(Context context) {
        super(context, R.style.TransparentDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246ad89a90ff05e39dcba17297446b1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246ad89a90ff05e39dcba17297446b1b");
            return;
        }
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8576ecbb690355758dbb7d13be93be62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8576ecbb690355758dbb7d13be93be62");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.hera_loading_dialog);
        this.b = (TextView) findViewById(R.id.loading_message);
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9736d5fd6f921163ef7f1e4c5c45e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9736d5fd6f921163ef7f1e4c5c45e42");
            return;
        }
        try {
            super.show();
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("LoadingDialog", e.getMessage());
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731e14af908bb97086839cbd87a748d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731e14af908bb97086839cbd87a748d5")).booleanValue();
        }
        try {
            return super.isShowing();
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("LoadingDialog", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ff4b41a34de2ee81bd4032ab4d44e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ff4b41a34de2ee81bd4032ab4d44e5");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("LoadingDialog", e.getMessage());
        }
    }
}
