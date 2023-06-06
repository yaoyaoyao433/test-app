package com.meituan.msc.modules.page.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoadingDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public TextView b;

    public LoadingDialog(Context context) {
        super(context, R.style.MSCTransparentDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a007e4e53edff2168fa875c9484e7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a007e4e53edff2168fa875c9484e7a");
            return;
        }
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7af0fea119824d6c45b3b6bc422515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7af0fea119824d6c45b3b6bc422515");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.msc_loading_dialog);
        this.b = (TextView) findViewById(R.id.loading_message);
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e5ddc86a314ea8a2b0dc2d946473cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e5ddc86a314ea8a2b0dc2d946473cd");
            return;
        }
        try {
            super.show();
        } catch (Exception e) {
            g.a("LoadingDialog", e.getMessage());
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3689de177ed427ae92b7667f01e39de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3689de177ed427ae92b7667f01e39de")).booleanValue();
        }
        try {
            return super.isShowing();
        } catch (Exception e) {
            g.a("LoadingDialog", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc539c2796dddfabc0bf272eacbcc17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc539c2796dddfabc0bf272eacbcc17");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            g.a("LoadingDialog", e.getMessage());
        }
    }
}
